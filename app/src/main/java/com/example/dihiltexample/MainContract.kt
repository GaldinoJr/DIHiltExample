package com.example.dihiltexample

interface MainContract {
    interface View{
        fun changeText()
        fun changeText2()
    }
    interface Presenter{
        fun init(mainActivity: MainContract.View)
    }
}