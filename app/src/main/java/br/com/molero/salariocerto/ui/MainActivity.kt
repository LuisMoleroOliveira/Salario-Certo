package br.com.molero.salariocerto.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.molero.salariocerto.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}