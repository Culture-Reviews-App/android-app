package com.eb.culturereviews.view.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.eb.culturereviews.viewmodel.ReviewListViewModel

@Composable
fun HomeScreen() {

    val viewModel: ReviewListViewModel = viewModel(factory = viewModelFactory {
        initializer {
            ReviewListViewModel()
        }
    })

    val allReviews = viewModel.review.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn {
            itemsIndexed(allReviews.value) { index, review ->
                ReviewPreviewCard(
                    review = review,
                )
            }
        }
    }
}