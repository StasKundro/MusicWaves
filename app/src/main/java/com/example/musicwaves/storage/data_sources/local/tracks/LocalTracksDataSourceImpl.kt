package com.example.musicwaves.storage.data_sources.local.tracks

import androidx.lifecycle.LiveData
import com.example.musicwaves.storage.local.TrackDao
import com.example.musicwaves.models.local.tracks.TrackLocal
import javax.inject.Inject

class LocalTracksDataSourceImpl @Inject constructor(private val trackDao: TrackDao): LocalTracksDataSource {
    override fun subscribeOnTracks(album: String): LiveData<List<TrackLocal>> = trackDao.getAll(album)

    override suspend fun insertAllTracks(tracks: List<TrackLocal>) = trackDao.insertAllTracks(tracks)

    override fun subscribeOnFavourite(): LiveData<List<TrackLocal>> = trackDao.getFavourite()
}