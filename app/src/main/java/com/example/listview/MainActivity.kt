package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val dogsList= ArrayList<Dogs>()

        dogsList.add(Dogs("Dog1","Desc1",R.drawable.a))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.b))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.c))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.d))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.e))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.f))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.g))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.h))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.i))
        dogsList.add(Dogs("Dog1","Desc1",R.drawable.j))


        val myAdapter=CustomAdapter(this,dogsList)
        binding.myList.adapter =myAdapter


        binding.myList.setOnItemClickListener { adapterView, view, i, l ->
            val textView= view as TextView
            Toast.makeText(this,textView.text.toString(),Toast.LENGTH_SHORT).show()

        }

    }
}