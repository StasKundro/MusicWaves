package com.example.musicwaves.domain.tracks

import androidx.lifecycle.LiveData
import com.example.musicwaves.models.local.tracks.TrackLocal

interface TracksInteractor {
    suspend fun fetchTracks(album: String, artist: String)
    fun subscribeOnTracks(album: String): LiveData<List<TrackLocal>>
    fun subscribeOnFavourite(): LiveData<List<TrackLocal>>
    suspend fun updateTracks(tracks: List<TrackLocal>)
}