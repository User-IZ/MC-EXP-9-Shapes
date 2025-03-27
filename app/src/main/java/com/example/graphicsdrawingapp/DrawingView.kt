package com.example.graphicsdrawingapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class DrawingView(context: Context, attrs: AttributeSet? = null) : View(context, attrs) {

    private val paint = Paint()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Set up paint properties
        paint.color = Color.RED
        paint.style = Paint.Style.FILL
        paint.strokeWidth = 8f

        // Draw a line
        canvas.drawLine(50f, 50f, 300f, 50f, paint)

        // Draw a rectangle
        paint.color = Color.BLUE
        canvas.drawRect(100f, 100f, 400f, 300f, paint)

        // Draw a circle
        paint.color = Color.GREEN
        canvas.drawCircle(500f, 500f, 100f, paint)

        // Draw an oval
        paint.color = Color.MAGENTA
        canvas.drawOval(200f, 600f, 600f, 800f, paint)
    }
}
