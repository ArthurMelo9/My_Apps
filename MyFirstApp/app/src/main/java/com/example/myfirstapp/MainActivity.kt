package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val changeWord = findViewById<TextView>(R.id.myText)

        var numberOfTimesClicked = 0

        val btnClickMe= findViewById<Button>(R.id.myButton)
        btnClickMe.setOnClickListener(){
            //btnClickMe.text = "Haha you clicked me"
            //changeWord.text = "You were able to change the text"
            numberOfTimesClicked ++
            changeWord.text = numberOfTimesClicked.toString()

            Toast.makeText(this, "Hello Arthur", Toast.LENGTH_LONG).show()

        }




    }
}