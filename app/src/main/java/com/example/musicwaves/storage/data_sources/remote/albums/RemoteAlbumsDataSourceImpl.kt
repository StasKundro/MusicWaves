package com.example.musicwaves.storage.data_sources.remote.albums

import com.example.musicwaves.storage.services.AlbumsService
import com.example.musicwaves.models.remote.albums.AlbumRemote
import javax.inject.Inject

class RemoteAlbumsDataSourceImpl @Inject constructor(private val albumsService: AlbumsService):
    RemoteAlbumsDataSource {
    override suspend fun getAlbums(tag: String): List<AlbumRemote> {
        return albumsService.getAlbums(tag = tag).albums.album
    }
}