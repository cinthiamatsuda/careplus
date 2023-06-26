package br.com.lcgroup.care

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btnEspecialidade= findViewById<Button>(R.id.button4)

        btnEspecialidade.setOnClickListener {
            val i = Intent(this, MainActivity4::class.java)
            startActivity(i)
        }
    }
}