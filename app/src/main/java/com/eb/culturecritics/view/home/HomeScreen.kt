package com.eb.culturecritics.view.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.eb.culturecritics.ui.theme.RedColor
import com.eb.culturecritics.viewmodel.CriticListViewModel

@Composable
fun HomeScreen(){

    val viewModel: CriticListViewModel = viewModel(factory = viewModelFactory {
        initializer {
            CriticListViewModel()
        }
    })

    val allCritics = viewModel.critic.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn {
            itemsIndexed(allCritics.value) { index, critic ->
                Text(
                    text = "${critic.criticName}, critic no: ${index+1}",
                    style = MaterialTheme.typography.bodyMedium.copy(color = RedColor),
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}