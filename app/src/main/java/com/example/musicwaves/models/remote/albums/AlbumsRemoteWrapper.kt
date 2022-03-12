package com.example.musicwaves.models.remote.albums

import com.google.gson.annotations.SerializedName

data class AlbumsRemoteWrapper (
	@SerializedName("albums") val albums : AlbumsRemote
)