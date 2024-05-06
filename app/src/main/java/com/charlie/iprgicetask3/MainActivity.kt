package com.charlie.iprgicetask3

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextMinutes: EditText
    private lateinit var buttonCalculate: Button
    private lateinit var textViewHours: TextView
    private lateinit var textViewMinutes: TextView
    private lateinit var textViewTotalPrice: TextView

    private val rentPerHour = 400.0
    private val rentPerMinute = 1.0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editTextMinutes = findViewById(R.id.editTextMinutes)
         buttonCalculate = findViewById(R.id.buttonCalculate)
         textViewHours = findViewById(R.id.textViewHours)
         textViewMinutes = findViewById(R.id.textViewMinutes)
         textViewTotalPrice = findViewById(R.id.textViewTotalPrice)

        buttonCalculate.setOnClickListener {
            val totalMinutes = editTextMinutes.text.toString().toIntOrNull() ?: 0

            val hours = totalMinutes / 60
            val minutes = totalMinutes % 60

            val totalPrice: Double = if (minutes > 0) {
                (rentPerHour * hours) + (rentPerMinute * minutes)
            } else {
                rentPerHour * hours
            }

            textViewHours.text = "Rental Hours: $hours"
            textViewMinutes.text = "Rental Minutes: $minutes"
            textViewTotalPrice.text = "Total Price: R%.2f".format(totalPrice)
        }
    }
}
