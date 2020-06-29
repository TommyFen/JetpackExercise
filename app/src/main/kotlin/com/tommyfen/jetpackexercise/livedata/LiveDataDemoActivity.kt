package com.tommyfen.jetpackexercise.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import cn.tommyfen.jetpackexercise.R

class LiveDataDemoActivity : AppCompatActivity() {

    private lateinit var nameViewModel: NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data_demo)
        nameViewModel = ViewModelProviders.of(this).get(NameViewModel::class.java)

        //liveData
        val nameObserver = Observer<String>{ newName ->
            Log.i("LiveDataDemoActivity", "new name is $newName")
        }
        nameViewModel.currentName.observe(this,nameObserver)

        //更新数据
        findViewById<Button>(R.id.btn_name_update).setOnClickListener {
            val anotherName = "Tommy"
            nameViewModel.currentName.setValue(anotherName)
        }
    }
}
