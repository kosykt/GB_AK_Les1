package ru.kostrykt.gb_ak_les1.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import ru.kostrykt.gb_ak_les1.R
import ru.kostrykt.gb_ak_les1.repository.RepositoryObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerWeather = findViewById<RecyclerView>(R.id.recyclerWeather)
        val adapter = WeatherAdapter(RepositoryObject)

        recyclerWeather.adapter = adapter
    }
}