package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName


data class ArtistRemote (

	@SerializedName("url") val url : String,
	@SerializedName("name") val name : String,
	@SerializedName("mbid") val mbid : String
)