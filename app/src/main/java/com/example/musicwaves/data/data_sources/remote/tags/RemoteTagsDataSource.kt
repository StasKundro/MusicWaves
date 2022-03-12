package com.example.musicwaves.data.data_sources.remote.tags

import com.example.musicwaves.models.remote.tags.TagRemote

interface RemoteTagsDataSource {
    suspend fun getTags(): List<TagRemote>
}