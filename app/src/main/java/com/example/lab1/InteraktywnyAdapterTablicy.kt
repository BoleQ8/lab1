package com.example.lab1
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class InteraktywnyAdapterTablicy(private val exampleList: List<ExampleItem>) : RecyclerView.Adapter<InteraktywnyAdapterTablicy.myViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.list_row,
                    parent, false)
            return myViewHolder(layoutInflater)
        }

        override fun onBindViewHolder(holder: myViewHolder, position: Int) {
            val currentItem = exampleList[position]
            holder.textView1.text = currentItem.text1


        }

        override fun getItemCount() = exampleList.size


    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView1: TextView = itemView.findViewById(R.id.nazwa_p)
    }
    }

