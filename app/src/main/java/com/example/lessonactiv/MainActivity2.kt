package com.example.lessonactiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var textView = findViewById<TextView>(R.id.tv)
        var i = intent

        if(i!=null)
        {
            textView.text =i.getCharSequenceExtra("salut")
        }

    }
}