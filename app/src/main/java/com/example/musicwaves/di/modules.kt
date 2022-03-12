package com.example.musicwaves.di

import android.content.Context
import androidx.room.Room
import com.example.musicwaves.data.data_sources.local.albums.LocalAlbumsDataSource
import com.example.musicwaves.data.data_sources.local.albums.LocalAlbumsDataSourceImpl
import com.example.musicwaves.data.data_sources.local.tags.LocalTagsDataSource
import com.example.musicwaves.data.data_sources.local.tags.LocalTagsDataSourceImpl
import com.example.musicwaves.data.data_sources.local.tracks.LocalTracksDataSource
import com.example.musicwaves.data.data_sources.local.tracks.LocalTracksDataSourceImpl
import com.example.musicwaves.data.data_sources.remote.albums.RemoteAlbumsDataSource
import com.example.musicwaves.data.data_sources.remote.albums.RemoteAlbumsDataSourceImpl
import com.example.musicwaves.data.data_sources.remote.tags.RemoteTagsDataSource
import com.example.musicwaves.data.data_sources.remote.tags.RemoteTagsDataSourceImpl
import com.example.musicwaves.data.data_sources.remote.tracks.RemoteTracksDataSource
import com.example.musicwaves.data.data_sources.remote.tracks.RemoteTracksDataSourceImpl
import com.example.musicwaves.data.local.*
import com.example.musicwaves.data.repository.AlbumsRepositoryImpl
import com.example.musicwaves.data.repository.TagsRepositoryImpl
import com.example.musicwaves.data.repository.TracksRepositoryImpl
import com.example.musicwaves.data.services.AlbumsService
import com.example.musicwaves.data.services.TagsService
import com.example.musicwaves.data.services.TracksService
import com.example.musicwaves.domain.albums.AlbumsInteractor
import com.example.musicwaves.domain.albums.AlbumsInteractorImpl
import com.example.musicwaves.domain.albums.AlbumsRepository
import com.example.musicwaves.domain.login.LoginInteractor
import com.example.musicwaves.domain.login.LoginInteractorImpl
import com.example.musicwaves.domain.registration.RegistrationInteractor
import com.example.musicwaves.domain.registration.RegistrationInteractorImpl
import com.example.musicwaves.domain.tags.TagsInteractor
import com.example.musicwaves.domain.tags.TagsInteractorImpl
import com.example.musicwaves.domain.tags.TagsRepository
import com.example.musicwaves.domain.tracks.TracksInteractor
import com.example.musicwaves.domain.tracks.TracksInteractorImpl
import com.example.musicwaves.domain.tracks.TracksRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
class ProvideModule {
    @Provides
    fun providesUserDao(@ApplicationContext context: Context): UserDao {
        return Room.databaseBuilder(context, AppRoomDB::class.java, "AppRoomDB").build()
            .getUserDao()
    }

    @Provides
    fun providesAlbumDao(@ApplicationContext context: Context): AlbumDao {
        return Room.databaseBuilder(context, AppRoomDB::class.java, "AppRoomDB").build()
            .getAlbumDao()
    }

    @Provides
    fun providesTagDao(@ApplicationContext context: Context): TagDao {
        return Room.databaseBuilder(context, AppRoomDB::class.java, "AppRoomDB").build()
            .getTagDao()
    }

    @Provides
    fun providesTrackDaoDao(@ApplicationContext context: Context): TrackDao {
        return Room.databaseBuilder(context, AppRoomDB::class.java, "AppRoomDB").build()
            .getTrackDao()
    }

    @Provides
    fun providesAlbumsService(): AlbumsService {
        return Retrofit.Builder()
            .baseUrl("https://ws.audioscrobbler.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(AlbumsService::class.java)
    }

    @Provides
    fun providesTagsService(): TagsService {
        return Retrofit.Builder()
            .baseUrl("https://ws.audioscrobbler.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TagsService::class.java)
    }

    @Provides
    fun providesTracksService(): TracksService {
        return Retrofit.Builder()
            .baseUrl("https://ws.audioscrobbler.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TracksService::class.java)
    }
}

@Module
@InstallIn(ViewModelComponent::class)
abstract class BindModule {

    @Binds
    abstract fun bindsRegistrationInteractor(
        registrationInteractor: RegistrationInteractorImpl
    ): RegistrationInteractor

    @Binds
    abstract fun bindsLoginInteractor(
        loginInteractor: LoginInteractorImpl
    ): LoginInteractor

    @Binds
    abstract fun bindsLocalAlbumsDataSource(
        localAlbumsDataSourceImpl: LocalAlbumsDataSourceImpl
    ): LocalAlbumsDataSource

    @Binds
    abstract fun bindsRemoteAlbumsDataSource(
        remoteAlbumsDataSourceImpl: RemoteAlbumsDataSourceImpl
    ): RemoteAlbumsDataSource

    @Binds
    abstract fun bindsAlbumsRepository(
        albumsRepositoryImpl: AlbumsRepositoryImpl
    ): AlbumsRepository

    @Binds
    abstract fun bindsAlbumsInteractor(
        albumsInteractorImpl: AlbumsInteractorImpl
    ): AlbumsInteractor

    @Binds
    abstract fun bindsLocalTagsDataSource(
        localTagsDataSourceImpl: LocalTagsDataSourceImpl
    ): LocalTagsDataSource

    @Binds
    abstract fun bindsRemoteTagsDataSource(
        remoteTagsDataSourceImpl: RemoteTagsDataSourceImpl
    ): RemoteTagsDataSource

    @Binds
    abstract fun bindsTagsRepository(
        tagsRepositoryImpl: TagsRepositoryImpl
    ): TagsRepository

    @Binds
    abstract fun bindsTagsInteractor(
        tagsInteractorImpl: TagsInteractorImpl
    ): TagsInteractor

    @Binds
    abstract fun bindsLocalTracksDataSource(
        localTracksDataSourceImpl: LocalTracksDataSourceImpl
    ): LocalTracksDataSource

    @Binds
    abstract fun bindsRemoteTracksDataSource(
        remoteTracksDataSourceImpl: RemoteTracksDataSourceImpl
    ): RemoteTracksDataSource

    @Binds
    abstract fun bindsTracksRepository(
        tracksRepositoryImpl: TracksRepositoryImpl
    ): TracksRepository

    @Binds
    abstract fun bindsTracksInteractor(
        tracksInteractorImpl: TracksInteractorImpl
    ): TracksInteractor
}























