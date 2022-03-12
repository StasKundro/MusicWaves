package com.example.musicwaves.data.data_sources.remote.albums

import com.example.musicwaves.models.remote.albums.AlbumRemote

interface RemoteAlbumsDataSource {
    suspend fun getAlbums(tag: String): List<AlbumRemote>
}