package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName

data class WikiRemote (

	@SerializedName("published") val published : String,
	@SerializedName("summary") val summary : String,
	@SerializedName("content") val content : String
)