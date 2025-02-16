package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        supportActionBar?.hide()
        if(Pg3_login.KEY1==true){
            Handler().postDelayed({
                intent=Intent(this,Pg5::class.java)
                startActivity(intent)
                finishAffinity()
            },4000)
        }else{
            Handler().postDelayed({
                intent=Intent(this,Pg2_Register::class.java)
                startActivity(intent)
                finishAffinity()
            },4000)
        }
        println("jdndjsnijsnsnbobnsonsnon ok nson ")
    }
}