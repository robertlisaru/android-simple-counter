package com.robertlisaru.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var counter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counterValue = 0

        counter = findViewById(R.id.counterText)
        counter.setOnClickListener {
            counterValue++
            counter.text = counterValue.toString()
        }

        counter.setOnLongClickListener {
            counterValue = 0
            counter.text = counterValue.toString()
            true
        }
    }
}

