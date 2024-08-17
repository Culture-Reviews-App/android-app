package com.eb.culturecritics.model

data class Critic (
//    @SerializedName("")
    val criticName: String,

//    @SerializedName("")
    val point: Int,

//    @SerializedName("")
    val userName: String,

    val type: String,

    val criticText: String,
)