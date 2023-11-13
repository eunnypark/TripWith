package com.example.tripwith

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            // 앱의 main activity로 넘어가기
            val start = Intent(this, MainActivity::class.java)
            startActivity(start)
            // 현재 액티비티 닫기
            finish()
        }, 3000)
    }
}