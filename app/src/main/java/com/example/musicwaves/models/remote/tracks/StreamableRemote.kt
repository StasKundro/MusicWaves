package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName

data class StreamableRemote (

	@SerializedName("fulltrack") val fulltrack : Int,
	@SerializedName("#text") val text : Int
)