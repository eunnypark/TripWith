package com.example.tripwith

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_page)

        val textView: TextView = findViewById(R.id.editBtn)
        textView.setOnClickListener {
            val intent = Intent(this, MyPageEdit::class.java)
            startActivity(intent)
        }

    }
}