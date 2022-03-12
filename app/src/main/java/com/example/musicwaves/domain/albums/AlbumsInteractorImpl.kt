package com.example.musicwaves.domain.albums

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.albums.AlbumEntity
import javax.inject.Inject

class AlbumsInteractorImpl @Inject constructor(private val albumsRepository: AlbumsRepository): AlbumsInteractor {
    override suspend fun fetchAlbums(tag: String) = albumsRepository.fetchAlbums(tag)

    override fun subscribeOnAlbums(tag: String): LiveData<List<AlbumEntity>> = albumsRepository.subscribeOnAlbums(tag)
}