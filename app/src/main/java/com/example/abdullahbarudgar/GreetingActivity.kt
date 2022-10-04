package com.example.abdullahbarudgar

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

         var greeting : TextView = findViewById(R.id.birthdayGreeting)
          var name = intent.getStringExtra("name").toString()
          greeting.setText("HAPPY BIRTHDAY $name")

        }

}
