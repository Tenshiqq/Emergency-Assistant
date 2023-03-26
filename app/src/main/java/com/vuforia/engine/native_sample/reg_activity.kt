package com.vuforia.engine.native_sample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class reg_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        val sign_up: Button
        sign_up = findViewById(R.id.sign_up)
        sign_up.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this, select_activity::class.java)
            startActivity(intent)
        })
    }
}