package com.capstone.saba.domain.usecase

import com.capstone.saba.domain.model.User
import io.reactivex.Flowable

interface UserUseCase {
    fun signUpWithEmail(email: String,
                        password: String,
                        name: String,
                        gender: String,
                        birthOfDate: String,
                        urlAva: String) : Flowable<Boolean>

    fun signInWithEmail(email: String,password: String) : Flowable<Boolean>

    fun getDataUser(): Flowable<User>

    fun signOut()
}