package com.example.musicwaves.data.data_sources.remote.tags

import com.example.musicwaves.data.services.TagsService
import com.example.musicwaves.models.remote.tags.TagRemote
import javax.inject.Inject

class RemoteTagsDataSourceImpl @Inject constructor(private val tagsService: TagsService): RemoteTagsDataSource {
    override suspend fun getTags(): List<TagRemote> = tagsService.getTags().toptags.tag
}