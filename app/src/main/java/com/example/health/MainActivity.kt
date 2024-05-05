package com.example.health

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


            val existing = findViewById<Button>(R.id.button)
            existing.setOnClickListener  {
                val intent = Intent(this,Existinguser::class.java)
                startActivity(intent)
            }
        val exist = findViewById<Button>(R.id.button4)
        exist.setOnClickListener {
            val intent = Intent(this, Newuser::class.java)
            startActivity(intent)

        }


        }
}