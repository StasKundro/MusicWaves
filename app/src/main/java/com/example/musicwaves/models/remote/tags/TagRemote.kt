package com.example.musicwaves.models.remote.tags

import com.google.gson.annotations.SerializedName

data class TagRemote(
    @SerializedName("name") val name: String,
    @SerializedName("count") val count: Int,
    @SerializedName("reach") val reach: Int
)