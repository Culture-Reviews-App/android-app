package com.eb.culturereviews.model

data class Review (
//    @SerializedName("")
    val reviewName: String,

//    @SerializedName("")
    val point: Int,

//    @SerializedName("")
    val userName: String,

    val type: String,

    val reviewText: String,
)