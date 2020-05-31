package com.tommyfen.jetpackexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import cn.tommyfen.jetpackexercise.databinding.ActivityViewBindingTestBinding

class ViewBindingTestActivity : AppCompatActivity() {

    private lateinit var bind: ActivityViewBindingTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityViewBindingTestBinding.inflate(layoutInflater)
        setContentView(bind.root)
    }

    override fun onResume() {
        super.onResume()
        bind.hello.setOnClickListener {
            Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show()
        }
    }
}
