package com.example.intentpraktikum

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.net.Uri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenSecond = findViewById<Button>(R.id.btnOpenSecond)

        btnOpenSecond.setOnClickListener {
            // Explicit Intent ke SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val btnOpenBrowser = findViewById<Button>(R.id.btnOpenBrowser);
        btnOpenBrowser.setOnClickListener {
            // Implicit Intent untuk membuka browser
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.unipma.ac.id"));
            startActivity(intent);
        }
    }
}