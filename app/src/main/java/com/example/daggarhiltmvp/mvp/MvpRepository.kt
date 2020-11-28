package com.example.daggarhiltmvp.mvp

import com.example.daggarhiltmvp.model.SportsModel
import com.example.daggarhiltmvp.networkauth.WebAuth
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MvpRepository @Inject constructor(private var webAuth: WebAuth) {

    fun provideAllSports() : Flow<SportsModel> {
        return flow {
            emit(webAuth.getAllSports())
        }
    }
}