package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
    }

    //vincular
    fun datos(view: View) {
        val intent = Intent(this@principal, datos::class.java)
        startActivity(intent)
    }

    //vincular
    fun institucion(view: View) {
        val intent = Intent(this@principal, institucion::class.java)
        startActivity(intent)
    }

    //vincular
    fun infoapp(view: View) {
        val intent = Intent(this@principal, infoapp::class.java)
        startActivity(intent)
    }

    //vincular
    fun asignaturas(view: View) {
        val intent = Intent(this@principal, asignaturas::class.java)
        startActivity(intent)
    }

    fun main(view: View) {
        val intent = Intent(this@principal, MainActivity::class.java)
        startActivity(intent)
    }
}