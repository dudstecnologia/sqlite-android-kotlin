package com.dudstecnologia.sqlitebasekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dudstecnologia.sqlitebasekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindig: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindig = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindig.root)

        bindig.btnOpenRegister.setOnClickListener {
            val intentForm = Intent(this, RegisterActivity::class.java)
            startActivity(intentForm)
        }
    }
}