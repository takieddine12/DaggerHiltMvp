package com.example.daggarhiltmvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.daggarhiltmvp.model.SportsModel
import com.example.daggarhiltmvp.mvp.MainContract
import com.example.daggarhiltmvp.mvp.Presenter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() , MainContract.PresenterView {

    @Inject
    lateinit var presenter: Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.onPresenterCreated()

    }

    override fun getSports(model: SportsModel) {
        for(i in 0 until model.sports.size) {
            findViewById<TextView>(R.id.hello).text = model.sports[0].strSport
        }
    }


}