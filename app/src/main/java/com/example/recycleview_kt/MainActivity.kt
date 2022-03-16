package com.example.recycleview_kt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        dataList.add(DataModel("Title", "Desc", R.drawable.flavicon2))
        dataList.add(DataModel("Title", "Desc", R.drawable.flavicon2))
        dataList.add(DataModel("Title", "Desc", R.drawable.hh))
        dataList.add(DataModel("Title", "Desc", R.drawable.hh))
        dataList.add(DataModel("Title", "Desc", R.drawable.hh))
        dataList.add(DataModel("Title", "Desc", R.drawable.hh))
        dataList.add(DataModel("Title", "Desc", R.drawable.hh))

        photoAdapter.setDataList(dataList)
    }
}