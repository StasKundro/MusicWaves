package com.example.musicwaves.storage.data_sources.remote.tracks

import com.example.musicwaves.models.remote.tracks.TrackRemote

interface RemoteTracksDataSource {
    suspend fun getTracks(album: String, artist: String): List<TrackRemote>
}