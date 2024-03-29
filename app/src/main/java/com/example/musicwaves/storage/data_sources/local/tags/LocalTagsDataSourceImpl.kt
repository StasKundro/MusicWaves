package com.example.musicwaves.storage.data_sources.local.tags

import com.example.musicwaves.storage.local.TagDao
import com.example.musicwaves.models.local.tags.TagLocal
import javax.inject.Inject

class LocalTagsDataSourceImpl @Inject constructor(private val tagDao: TagDao): LocalTagsDataSource {
    override fun subscribeOnTags() = tagDao.getAll()

    override suspend fun insertAllTags(tags: List<TagLocal>) = tagDao.insertAllTags(tags)
}