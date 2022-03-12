package com.example.musicwaves.domain.tags

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.tags.TagLocal
import javax.inject.Inject

class TagsInteractorImpl @Inject constructor(private val tagsRepository: TagsRepository): TagsInteractor {
    override suspend fun fetchTags() = tagsRepository.fetchTags()

    override fun subscribeOnTags(): LiveData<List<TagLocal>> = tagsRepository.subscribeOnTags()
}