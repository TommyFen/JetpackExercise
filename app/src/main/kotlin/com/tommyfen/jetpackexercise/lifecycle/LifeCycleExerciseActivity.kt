package com.tommyfen.jetpackexercise.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.tommyfen.jetpackexercise.R

class LifeCycleExerciseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle_excercise)

        lifecycle.addObserver(LifeCycleObserver())
    }
}
