package com.eb.culturecritics.view.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.eb.culturecritics.ui.theme.RedColor

@Composable
fun HomeScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "home screen",
            style = MaterialTheme.typography.bodyMedium.copy(color = RedColor)
        )
    }
}