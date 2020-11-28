package com.example.daggarhiltmvp.mvp

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class Presenter @Inject constructor(var repository : MvpRepository , var view : MainContract.PresenterView) : MainContract.IPresenter {
    override fun onPresenterCreated() {
        GlobalScope.launch {
            repository
                .provideAllSports()
                .buffer()
                .collect {
                    view.getSports(it)
                }
        }
    }
}