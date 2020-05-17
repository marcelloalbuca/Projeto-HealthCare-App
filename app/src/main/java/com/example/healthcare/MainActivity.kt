package com.example.healthcare

import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var result: TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val str = findViewById(R.id.nome) as EditText
        val button = findViewById(R.id.btn) as Button

        //Onclick em lambda
        button.setOnClickListener {

            Toast.makeText(this,str.text,Toast.LENGTH_LONG).show()

            str.text = Editable.Factory.getInstance().newEditable("")

        }
    }
}
