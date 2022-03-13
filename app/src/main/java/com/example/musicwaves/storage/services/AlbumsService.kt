package com.example.musicwaves.storage.services

import com.example.musicwaves.models.remote.albums.AlbumsRemoteWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface AlbumsService {
    companion object{
        private const val BASE_PATH = "2.0"
        private const val METHOD = "tag.getTopAlbums"
        private const val API_KEY = "12a4d471602d41dc81d92e05c2173418"
        private const val FORMAT = "json"
    }

    @GET(BASE_PATH)
    suspend fun getAlbums(
        @Query("method") method: String = METHOD,
        @Query("tag") tag: String,
        @Query("api_key") apiKey: String = API_KEY,
        @Query("format") format: String = FORMAT,
    ): AlbumsRemoteWrapper
}