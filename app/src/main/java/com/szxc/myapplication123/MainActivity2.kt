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
        val dulieunhan = bundle!!.getString("dulieu1")
        Toast.makeText(this, dulieunhan, Toast.LENGTH_SHORT).show()
        val ten = findViewById<TextView>(R.id.hienthi)
        val button = findViewById<Button>(R.id.trolai)
        ten.text = "hello " + dulieunhan
        button.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}
