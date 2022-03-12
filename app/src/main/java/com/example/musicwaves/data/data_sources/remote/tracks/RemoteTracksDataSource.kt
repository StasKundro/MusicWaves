package com.example.musicwaves.data.data_sources.remote.tracks

import com.example.musicwaves.models.remote.tracks.TrackRemote

interface RemoteTracksDataSource {
    suspend fun getTracks(album: String, artist: String): List<TrackRemote>
}