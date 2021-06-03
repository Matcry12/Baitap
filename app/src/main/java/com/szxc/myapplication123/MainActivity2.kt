package com.szxc.myapplication123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle: Bundle? = intent.extras
        val hm = bundle!!.getString("dare")
        Toast.makeText(this, hm , Toast.LENGTH_SHORT).show()
        var ten = findViewById<TextView>(R.id.ad)
        val button = findViewById<Button>(R.id.trolai)
        ten.text = hm
        button.setOnClickListener(){
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        }

    }
