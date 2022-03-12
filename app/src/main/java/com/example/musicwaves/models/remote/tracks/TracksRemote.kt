package com.example.musicwaves.models.remote.tracks

import com.google.gson.annotations.SerializedName

data class TracksRemote (

	@SerializedName("track") val track : List<TrackRemote>
)