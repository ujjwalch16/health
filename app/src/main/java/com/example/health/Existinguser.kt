package com.example.health

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Existinguser : AppCompatActivity() {
    lateinit var usernamev :EditText
    lateinit var passwerinput :EditText
    lateinit var loginbutton :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_existinguser)

        usernamev = findViewById(R.id.user)
        passwerinput = findViewById(R.id.pass)
        loginbutton = findViewById(R.id.button2)


        val exist = findViewById<Button>(R.id.button3)
        exist.setOnClickListener {
            val intent = Intent(this, Newuser::class.java)
            startActivity(intent)
        }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
    }
}