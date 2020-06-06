package com.example.healthcare.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.healthcare.R
import com.example.healthcare.ui.login.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed(Runnable {
            openLoginScreen()
        },1500)
    }

    private fun openLoginScreen() {
        startActivity(Intent(this, LoginActivity::class.java))
    }
}
