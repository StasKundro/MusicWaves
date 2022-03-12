package com.example.musicwaves.domain.tags

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.tags.TagLocal

interface TagsRepository {
    suspend fun fetchTags()
    fun subscribeOnTags(): LiveData<List<TagLocal>>
}