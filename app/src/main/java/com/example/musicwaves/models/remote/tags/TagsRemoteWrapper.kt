package com.example.musicwaves.models.remote.tags

import com.google.gson.annotations.SerializedName

data class TagsRemoteWrapper (
	@SerializedName("toptags") val toptags : TopTagsRemote
)