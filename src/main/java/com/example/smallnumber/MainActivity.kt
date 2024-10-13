package com.example.SmallNumber // Ensure this matches your package name

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.smallnumber.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Declare binding
    private lateinit var binding: ActivityMainBinding

    private var num1 = 0
    private var num2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize binding with layout inflater
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set onClickListener for Compare button
        binding.Comparebutton.setOnClickListener {
            val num1text = binding.Number1.text.toString()
            val num2text = binding.Number2.text.toString()

            // Handle empty inputs
            if (num1text.isEmpty() || num2text.isEmpty()) {
                Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Convert to integers
            num1 = num1text.toInt()
            num2 = num2text.toInt()

            // Display result
            val result = compareNumbers().toString()
            binding.Result.text = "Smaller number is: $result"
        }
    }

    // Compare function to return the smaller number
    private fun compareNumbers(): Int {
        if (num1 < 0 || num2 < 0) {
            Toast.makeText(this, "Value can't be less than zero", Toast.LENGTH_SHORT).show()
            return -1 // Return -1 or any other indicator for invalid input
        }
        return if (num1 < num2) num1 else num2
    }
}
