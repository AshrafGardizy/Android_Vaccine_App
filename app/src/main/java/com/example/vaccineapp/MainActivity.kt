package com.example.vaccineapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- AdapterView: RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recycleView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //2- Dat Souce: Data Model
        var vaccineList:ArrayList<VaccineModel> = ArrayList()
        var v1 = VaccineModel("COVID-19",R.drawable.vaccine1)
        var v2 = VaccineModel("Hapitatis B Vacine",R.drawable.vaccine4)
        var v3 = VaccineModel("Titanus Vaccine",R.drawable.vaccine5)
        var v4 = VaccineModel("Penumococal Vaccine",R.drawable.vaccine6)
        var v5 = VaccineModel("Rotavirus Vaccine",R.drawable.vaccine7)
        var v6 = VaccineModel("Mealease Vaccine",R.drawable.vaccine8)
        var v7 = VaccineModel("Checkinpox Vaccine",R.drawable.vaccine9)
        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        //3-
        val adapter = MyAdapter(vaccineList)
        recyclerView.adapter = adapter
    }
}