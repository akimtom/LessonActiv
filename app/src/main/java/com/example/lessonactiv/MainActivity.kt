package com.example.lessonactiv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var startBtn:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View) {
        val intent = Intent(this,MainActivity2::class.java).
        apply{ putExtra("salut","Привет с Main Activity") }

        startActivity(intent)
    }
}