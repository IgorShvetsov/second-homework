package com.example.homework2activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.homework2activity.view.SecondScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onNextScreen(view: View) {
        val buttonOnNextScreen = Intent(this, SecondScreen::class.java)
        startActivity(buttonOnNextScreen)
    }
}