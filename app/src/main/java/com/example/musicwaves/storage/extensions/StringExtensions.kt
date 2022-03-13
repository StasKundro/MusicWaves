package com.example.musicwaves.storage.extensions

import androidx.core.util.PatternsCompat

fun String?.isPasswordValid(): Boolean = this != null && isNotBlank() && this.length >= 4

fun String?.isEmailValid(): Boolean = this != null && isNotBlank() && PatternsCompat.EMAIL_ADDRESS.matcher(this).matches()