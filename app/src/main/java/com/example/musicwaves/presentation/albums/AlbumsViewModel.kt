package com.example.musicwaves.presentation.albums

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.musicwaves.domain.albums.AlbumsInteractor
import com.example.musicwaves.domain.login.LoginInteractor
import com.example.musicwaves.domain.tags.TagsInteractor
import com.example.musicwaves.models.local.albums.AlbumEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumsViewModel @Inject constructor(
    private val albumsInteractor: AlbumsInteractor
) : ViewModel() {

    fun fetchAlbums(tag: String) {
        viewModelScope.launch(Dispatchers.IO) {
            albumsInteractor.fetchAlbums(tag)
        }
    }

    fun subscribeOnAlbums(tag: String): LiveData<List<AlbumEntity>> = albumsInteractor.subscribeOnAlbums(tag)
}