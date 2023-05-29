package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editTextTextPersonName)
        resultText = findViewById(R.id.textView2)
    }
    fun BtnClick(view: View){
        resultText?.text = editText?.text.toString()
    }

    private var editText:   EditText? = null
    private var resultText: TextView? = null
}