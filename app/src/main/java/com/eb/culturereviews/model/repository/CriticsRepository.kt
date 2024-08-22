package com.eb.culturereviews.model.repository

import com.eb.culturereviews.model.Review

interface ReviewsRepository {

    suspend fun getReviewsList(): List<Review>

}