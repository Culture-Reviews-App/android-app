package com.eb.culturereviews.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eb.culturereviews.model.Review
import com.eb.culturereviews.model.repository.ReviewsRepositoryImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ReviewListViewModel : ViewModel() {
    private val repository = ReviewsRepositoryImpl()
    private val _reviews = MutableStateFlow<List<Review>>(emptyList())
    val review: StateFlow<List<Review>> = _reviews

    init {
        getReviewsList()
    }

    private fun getReviewsList() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val reviewList = repository.getReviewsList()
                _reviews.value = reviewList
            } catch (e: Exception) {
                Log.e("ReviewListViewModel", "Failed to fetch review list", e)
            }
        }
    }
}

