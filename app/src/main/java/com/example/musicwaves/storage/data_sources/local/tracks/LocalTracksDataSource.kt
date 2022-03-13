package com.example.musicwaves.storage.data_sources.local.tracks

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.tracks.TrackLocal

interface LocalTracksDataSource {
    fun subscribeOnTracks(album: String): LiveData<List<TrackLocal>>

    suspend fun insertAllTracks(tracks: List<TrackLocal>)

    fun subscribeOnFavourite(): LiveData<List<TrackLocal>>

}