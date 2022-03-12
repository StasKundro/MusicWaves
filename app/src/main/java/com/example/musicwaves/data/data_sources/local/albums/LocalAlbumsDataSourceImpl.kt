package com.example.musicwaves.data.data_sources.local.albums

import androidx.lifecycle.LiveData
import com.example.musicwaves.data.local.AlbumDao
import com.example.musicwaves.models.local.albums.*
import javax.inject.Inject

class LocalAlbumsDataSourceImpl @Inject constructor(private val albumDao: AlbumDao):
    LocalAlbumsDataSource {

    override fun subscribeOnAlbums(tag: String): LiveData<List<AlbumEntity>> = albumDao.getAll(tag)

    override suspend fun insertAllAlbumLocal(albums: List<AlbumLocal>) = albumDao.insertAllAlbums(albums)

    override suspend fun insertAllArtistLocal(artist: List<ArtistLocal>) = albumDao.insertAllArtists(artist)

    override suspend fun insertAllImageLocal(images: List<ImageLocal>) = albumDao.insertAllImages(images)

    override suspend fun insertAllAttrLocal(attrs: List<AttrLocal>) = albumDao.insertAllAttrs(attrs)
}