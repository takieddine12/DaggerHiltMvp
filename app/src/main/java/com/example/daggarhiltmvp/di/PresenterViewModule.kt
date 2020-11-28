package com.example.daggarhiltmvp.di

import com.example.daggarhiltmvp.mvp.MainContract
import com.example.daggarhiltmvp.mvp.MainContractViewImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class PresenterViewModule {

      @Binds
      abstract fun provideInterface(myClass : MainContractViewImpl) : MainContract.PresenterView

}