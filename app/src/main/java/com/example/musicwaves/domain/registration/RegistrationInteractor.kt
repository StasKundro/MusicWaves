package com.example.musicwaves.domain.registration

import com.example.musicwaves.models.local.user.UserEntity

interface RegistrationInteractor {
    suspend fun saveUser(userEntity: UserEntity)
}