package com.example.codecombatsolutions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        Thread.sleep(3000)
        startActivity(Intent(this, MainActivity::class.java))
    }
}