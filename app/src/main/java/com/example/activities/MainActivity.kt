package com.example.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.btnImage).setOnClickListener {
            startActivity(Intent(this, ImageActivity::class.java))
        }

        findViewById<View>(R.id.btnVideo).setOnClickListener {
            startActivity(Intent(this, VideoActivity::class.java))
        }

        findViewById<View>(R.id.btnImageVideo).setOnClickListener {
            startActivity(Intent(this, ImageToVideoActivity::class.java))
        }
    }
}
