package com.example.musicwaves.data.data_sources.remote.tracks

import com.example.musicwaves.data.services.TracksService
import javax.inject.Inject

class RemoteTracksDataSourceImpl @Inject constructor(private val tracksService: TracksService) : RemoteTracksDataSource {
    override suspend fun getTracks(album: String, artist: String) = tracksService.getTracks(album, artist).album.tracks.track
}