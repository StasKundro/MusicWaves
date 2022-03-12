package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName

data class TrackRemoteWrapper (

	@SerializedName("album") val album : AlbumRemote
)