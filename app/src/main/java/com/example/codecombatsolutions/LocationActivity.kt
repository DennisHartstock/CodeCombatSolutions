package com.example.codecombatsolutions

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class LocationActivity : AppCompatActivity() {

    private lateinit var tvDungeonsOfKithgard: TextView

    private lateinit var tvLabelLocation: TextView
    private lateinit var rvLocations: RecyclerView
    private lateinit var tvArrayLocations: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location)
        initViews()

        tvDungeonsOfKithgard.setOnClickListener {
            startActivity(Intent(this, SolutionActivity::class.java))
        }

//        tvArrayLocations.text = R.array.array_locations.toString()
    }

    private fun initViews() {
        tvDungeonsOfKithgard = findViewById(R.id.tvDungeonsOfKithgard)
//        tvLabelLocation = findViewById(R.id.tvLabelLocation)
////        rvLocations = findViewById(R.id.rvLocations)
//        tvArrayLocations = findViewById(R.id.tvArrayLocations)
    }

    public fun newIntent(context: Context): Intent {
        return Intent(context, LocationActivity::class.java)
    }
}