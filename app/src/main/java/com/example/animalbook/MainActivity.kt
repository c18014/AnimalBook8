package com.example.animalbook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = titleFragment as? Titlefragment
        fragment?.setTitle("フラグメント動物図鑑")


        nextButton.setOnClickListener {
            val intent = Intent(this,SubActivity::class.java)
            startActivity(intent)
        }


    }
}
