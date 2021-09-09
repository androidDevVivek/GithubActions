package com.krazybee.githubactions

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "1.0", Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()
    }
}
