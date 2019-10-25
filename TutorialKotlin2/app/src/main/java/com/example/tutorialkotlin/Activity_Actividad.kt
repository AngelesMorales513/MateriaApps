package com.example.tutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__actividad.*

class Activity_Actividad : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__actividad)
        btnRegresarActivity.setOnClickListener {
            finish()
        }
    }
}
