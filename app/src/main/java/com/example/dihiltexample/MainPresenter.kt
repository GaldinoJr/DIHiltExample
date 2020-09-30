package com.example.dihiltexample

import javax.inject.Inject

class MainPresenter @Inject constructor(){
    fun init(mainActivity: MainContract.View) {
        mainActivity.changeText()
    }
}