package com.example.musicwaves.domain.login

import com.example.musicwaves.models.local.user.UserEntity

interface LoginInteractor {
    suspend fun checkUser(userEntity: UserEntity): Boolean
    suspend fun checkAutoLogin(): Boolean
    suspend fun logout()
}