package com.example.tutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity__list_view.*

class Activity_ListView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__list_view)
        btnRegresarList.setOnClickListener {
            finish()
        }
    }
}
