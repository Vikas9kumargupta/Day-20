package com.example.day20

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var dialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.btnClick)
        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialog)
        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.background_alertbox))

        //Creating variable for the custom_dialog.xml design

        val buttonGood = dialog.findViewById<Button>(R.id.btn2)
        val buttonFeedback = dialog.findViewById<Button>(R.id.btn1)

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }
        buttonFeedback.setOnClickListener {
            //intents
            Toast.makeText(this,"Your Feedback is Submitted Successfully!!",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        myButton.setOnClickListener {
            dialog.show()
        }

    }
}