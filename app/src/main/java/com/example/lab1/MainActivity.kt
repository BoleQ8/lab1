package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imie = findViewById<EditText>(R.id.imie)
        val nazwisko = findViewById<EditText>(R.id.nazwisko)
        val liczbaOcen = findViewById<EditText>(R.id.ocena)
        val przyciskOceny = findViewById<Button>(R.id.oceny_b)

        imie.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus) {
                //Toast.makeText(applicationContext, "Jest fokus", Toast.LENGTH_SHORT).show()
            } else if(!hasFocus && imie.text.isEmpty()) {
                Toast.makeText(applicationContext, "Pole imie nie moze byc puste", Toast.LENGTH_SHORT).show()
                imie.error="Imie nie może być puste!"
            }
        }

        nazwisko.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus) {
                //Toast.makeText(applicationContext, "Jest fokus", Toast.LENGTH_SHORT).show()
            } else if(!hasFocus && nazwisko.text.isEmpty()) {
                Toast.makeText(applicationContext, "Pole nazwisko nie moze byc puste", Toast.LENGTH_SHORT).show()
                nazwisko.error="Nazwisko nie może być puste!"
            }
        }

        liczbaOcen.setOnFocusChangeListener { _, hasFocus ->
            if(hasFocus) {
                //Toast.makeText(applicationContext, "Jest fokus", Toast.LENGTH_SHORT).show()
            } else if(!hasFocus && liczbaOcen.text.isEmpty()) {
                Toast.makeText(applicationContext, "Pole liczba ocen nie moze byc puste", Toast.LENGTH_SHORT).show()
                liczbaOcen.error="Podaj oceny od 5 do 15!"
            }
        }

        val ocenyTextWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if(imie.text.toString().isEmpty() || nazwisko.text.toString().isEmpty() || liczbaOcen.text.isEmpty()) {
                    przyciskOceny.visibility = Button.INVISIBLE
                } else {
                    przyciskOceny.visibility = Button.VISIBLE
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        }

        imie.addTextChangedListener(ocenyTextWatcher)
        nazwisko.addTextChangedListener(ocenyTextWatcher)
        liczbaOcen.addTextChangedListener(ocenyTextWatcher)

    }
}
