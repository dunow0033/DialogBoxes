package com.example.dialogboxes

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity()
{

    private lateinit var button : Button

    private lateinit var builder: AlertDialog.Builder



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edittext = EditText(this)

        button = findViewById(R.id.button)

        builder = AlertDialog.Builder(this)

        button.setOnClickListener {
            builder.setTitle("Alert!!")
                .setMessage("Do you want to exit?")
                .setView(edittext)
                .setCancelable(true)
                .setPositiveButton("Yes"){ dialogInterface, it ->
                    finish()
                }
                .setNegativeButton("No"){ dialogueInterface, it ->
                    dialogueInterface.cancel()
                }
                .setNeutralButton("Help"){ dialogueInterface, it ->
                    Toast.makeText(this@MainActivity, "Help Clicked", Toast.LENGTH_SHORT).show()
                }.show()
        }
    }
}