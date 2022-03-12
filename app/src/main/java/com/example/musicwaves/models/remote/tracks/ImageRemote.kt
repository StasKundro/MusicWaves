package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName

data class ImageRemote (

	@SerializedName("size") val size : String,
	@SerializedName("#text") val text : String
)