package com.example.tripwith

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.ImageView

class NotificationChannel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_channel)

        val backButton: ImageView = findViewById(R.id.backBtn)
        backButton.setOnClickListener {
            finish() // 현재 액티비티 종료
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}