package com.example.daggarhiltmvp.mvp

import com.example.daggarhiltmvp.model.SportsModel

interface MainContract {

    interface PresenterView {
        fun getSports(model : SportsModel)
    }
    interface  IPresenter {
        fun onPresenterCreated()
    }
}