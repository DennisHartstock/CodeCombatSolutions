package com.example.codecombatsolutions

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvWorlds: RecyclerView
    private lateinit var tvKithgardDungeon: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

        tvKithgardDungeon.setOnClickListener {
            startActivity(Intent(this, LocationActivity::class.java))
        }

    }

    private fun initViews() {
//        rvWorlds = findViewById(R.id.rvWorlds)
        tvKithgardDungeon = findViewById(R.id.tvKithgardDungeon)
    }


}