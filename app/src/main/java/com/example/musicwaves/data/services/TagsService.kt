package com.example.musicwaves.data.services

import com.example.musicwaves.models.remote.tags.TagsRemoteWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface TagsService {
    companion object{
        private const val BASE_PATH = "2.0"
        private const val METHOD = "tag.getTopTags"
        private const val API_KEY = "12a4d471602d41dc81d92e05c2173418"
        private const val FORMAT = "json"
    }

    @GET(BASE_PATH)
    suspend fun getTags(
        @Query("method") method: String = METHOD,
        @Query("api_key") apiKey: String = API_KEY,
        @Query("format") format: String = FORMAT,
    ): TagsRemoteWrapper
}