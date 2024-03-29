package com.example.musicwaves.storage.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.musicwaves.models.local.tags.TagLocal

@Dao
interface TagDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAllTags(tags: List<TagLocal>)

    @Query("SELECT * FROM tagLocal")
    fun getAll(): LiveData<List<TagLocal>>
}