package com.example.lab1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = getIntent()
        val LiczbaOcenInt = intent.getIntExtra("liczbaOcen",0)
        val exampleList = lista(LiczbaOcenInt)
        val recyclerView: RecyclerView = findViewById(R.id.recycler1)
        recyclerView.adapter = RecyclerAdapter(exampleList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

    }
    private fun lista(size: Int): List<ExampleItem>{
        val list = ArrayList<ExampleItem>()

        for (i in 0 until size) {

            val item = ExampleItem("tekst")
            list += item
        }
        return list
    }
}