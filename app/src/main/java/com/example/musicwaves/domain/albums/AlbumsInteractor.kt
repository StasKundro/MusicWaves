package com.example.musicwaves.domain.albums

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.albums.AlbumEntity

interface AlbumsInteractor {
    suspend fun fetchAlbums(tag: String)
    fun subscribeOnAlbums(tag: String): LiveData<List<AlbumEntity>>
}