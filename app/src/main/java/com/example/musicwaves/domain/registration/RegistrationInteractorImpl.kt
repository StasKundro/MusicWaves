package com.example.musicwaves.domain.registration

import com.example.musicwaves.storage.local.UserDao
import com.example.musicwaves.models.local.user.UserEntity
import javax.inject.Inject

class RegistrationInteractorImpl @Inject constructor(private val userDao: UserDao) : RegistrationInteractor {
    override suspend fun saveUser(userEntity: UserEntity){
        userDao.insert(userEntity)
    }
}