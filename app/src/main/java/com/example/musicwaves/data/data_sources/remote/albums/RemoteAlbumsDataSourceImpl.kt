package com.example.musicwaves.data.data_sources.remote.albums

import com.example.musicwaves.data.services.AlbumsService
import com.example.musicwaves.models.remote.albums.AlbumRemote
import javax.inject.Inject

class RemoteAlbumsDataSourceImpl @Inject constructor(private val albumsService: AlbumsService):
    RemoteAlbumsDataSource {
    override suspend fun getAlbums(tag: String): List<AlbumRemote> {
        return albumsService.getAlbums(tag = tag).albums.album
    }
}