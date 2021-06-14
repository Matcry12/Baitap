package com.szxc.myapplication123

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "tứng tưng từng tưng", Toast.LENGTH_SHORT).show()
        val editText = findViewById<EditText>(R.id.nhapten)
        val button = findViewById<Button>(R.id.back)
        button.setOnClickListener(){
            val intent : Intent = Intent(this, MainActivity2::class.java)
            val dulieunhap = editText.text.toString()
            Toast.makeText(this, dulieunhap, Toast.LENGTH_SHORT).show()
            intent.putExtra("dulieu1", dulieunhap)
            startActivity(intent)
        }
        }

}
