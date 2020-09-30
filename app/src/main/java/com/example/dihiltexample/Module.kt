package com.example.dihiltexample

import dagger.Binds
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.Module

@Module
@InstallIn(ActivityComponent::class)
abstract class Module {
    @Binds
    abstract fun bindService(
        presenter: MainPresenter2
    ): MainContract.Presenter
}