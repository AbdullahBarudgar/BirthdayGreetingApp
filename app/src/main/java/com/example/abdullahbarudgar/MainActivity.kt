package com.example.abdullahbarudgar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showGreeting(view: View) {

    val name : EditText =findViewById(R.id.getName)
    val n =name.editableText.toString()

    val intent= Intent(this , GreetingActivity::class.java)
        intent.putExtra("name",n)
        startActivity(intent)
    }
}



