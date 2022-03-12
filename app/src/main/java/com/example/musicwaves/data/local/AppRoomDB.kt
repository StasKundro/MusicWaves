package com.example.musicwaves.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.musicwaves.models.local.tracks.TrackLocal
import com.example.musicwaves.models.local.albums.*
import com.example.musicwaves.models.local.tags.TagLocal
import com.example.musicwaves.models.local.user.UserEntity

@Database(
    entities = [
        UserEntity::class,
        AlbumLocal::class,
        ArtistLocal::class,
        ImageLocal::class,
        AttrLocal::class,
        TagLocal::class,
        TrackLocal::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppRoomDB : RoomDatabase() {
    abstract fun getUserDao(): UserDao
    abstract fun getAlbumDao(): AlbumDao
    abstract fun getTagDao(): TagDao
    abstract fun getTrackDao(): TrackDao
}