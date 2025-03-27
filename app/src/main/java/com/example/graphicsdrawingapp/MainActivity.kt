package com.example.graphicsdrawingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Create and set DrawingView dynamically
        val drawingView = DrawingView(this)
        setContentView(drawingView)
    }
}

