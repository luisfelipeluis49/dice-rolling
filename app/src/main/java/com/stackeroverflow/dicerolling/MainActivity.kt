package com.stackeroverflow.dicerolling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll: Button = findViewById(R.id.roll_btn)
        roll.text = "RPG'n Roll"
        var num = 1
        roll.setOnClickListener {
            Toast.makeText(this, "Clicked $num", Toast.LENGTH_SHORT).show()
            num++
        }
    }
}
