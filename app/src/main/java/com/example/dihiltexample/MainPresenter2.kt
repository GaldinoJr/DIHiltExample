package com.example.dihiltexample

import javax.inject.Inject

class MainPresenter2 @Inject constructor(): MainContract.Presenter{
    override fun init(mainActivity: MainContract.View) {
        mainActivity.changeText2()
    }
}