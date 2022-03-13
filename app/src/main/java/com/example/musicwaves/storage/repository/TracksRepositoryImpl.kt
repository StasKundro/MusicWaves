package com.example.musicwaves.storage.repository

import androidx.lifecycle.LiveData
import com.example.musicwaves.storage.data_sources.local.tracks.LocalTracksDataSource
import com.example.musicwaves.storage.data_sources.remote.tracks.RemoteTracksDataSource
import com.example.musicwaves.domain.tracks.TracksRepository
import com.example.musicwaves.models.local.tracks.TrackLocal
import javax.inject.Inject

class TracksRepositoryImpl @Inject constructor(
    private val remoteTracksDataSource: RemoteTracksDataSource,
    private val localTracksDataSource: LocalTracksDataSource
): TracksRepository {
    override suspend fun fetchTracks(album: String, artist: String) {
        try {
            val tracks = remoteTracksDataSource.getTracks(album, artist)
            localTracksDataSource.insertAllTracks(tracks.map { TrackLocal.fromRemote(it, album) })
        }catch (e: Exception){
            e.printStackTrace()
        }
    }

    override fun subscribeOnTracks(album: String): LiveData<List<TrackLocal>> = localTracksDataSource.subscribeOnTracks(album)
    override fun subscribeOnFavourite(): LiveData<List<TrackLocal>> = localTracksDataSource.subscribeOnFavourite()
    override suspend fun updateTracks(tracks: List<TrackLocal>) = localTracksDataSource.insertAllTracks(tracks)
}