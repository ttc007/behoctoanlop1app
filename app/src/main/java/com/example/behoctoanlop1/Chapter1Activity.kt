package com.example.behoctoanlop1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chapter1.*

class Chapter1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chapter1)

        btn_chapter1unit1.setOnClickListener{
            startActivity(Intent(this, Chapter1Unit1Activity::class.java))
        }
    }
}
