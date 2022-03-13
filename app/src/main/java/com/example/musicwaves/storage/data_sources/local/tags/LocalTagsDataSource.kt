package com.example.musicwaves.storage.data_sources.local.tags

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.tags.TagLocal

interface LocalTagsDataSource {
    fun subscribeOnTags(): LiveData<List<TagLocal>>

    suspend fun insertAllTags(tags: List<TagLocal>)
}