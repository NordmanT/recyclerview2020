package com.example.recyclerview2020


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val lista = arrayOf("Eka","Toka")


        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerView)
// Create an adapter and supply the data to be displayed.
// Create an adapter and supply the data to be displayed.
        mAdapter = CustomAdapter(lista)
// Connect the adapter with the RecyclerView.
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter)
// Give the RecyclerView a default layout manager.
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(LinearLayoutManager(this))


    }
}