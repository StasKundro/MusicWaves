package com.example.musicwaves.models.remote.tags

import com.google.gson.annotations.SerializedName

data class AttrRemote (
	@SerializedName("offset") val offset : Int,
	@SerializedName("num_res") val num_res : Int,
	@SerializedName("total") val total : Int
)