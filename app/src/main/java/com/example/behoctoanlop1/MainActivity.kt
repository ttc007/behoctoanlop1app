package com.example.behoctoanlop1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_chapter1.setOnClickListener {
            startActivity(Intent(this, Chapter1Activity::class.java))
        }

        btn_chapter2.setOnClickListener {

        }

        btn_chapter3.setOnClickListener {

        }

        btn_chapter4.setOnClickListener {

        }
    }
}
