package com.example.dihiltexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), MainContract.View {
    @Inject lateinit var mainPresenter: MainPresenter
    @Inject lateinit var mainPresenter2: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.init(this)
        mainPresenter2.init(this)
    }

    override fun changeText() {
        tvMessage.text = "Injecao sem interface.OK"
    }

    override fun changeText2() {
        tvMessage2.text = "Injecao com interface.OK"
    }
}