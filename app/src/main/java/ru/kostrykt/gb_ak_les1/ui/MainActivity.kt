package ru.kostrykt.gb_ak_les1.ui

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import ru.kostrykt.gb_ak_les1.R
import ru.kostrykt.gb_ak_les1.repository.RepositoryObject

const val TAG_LOG = "tag_log"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerWeather = findViewById<RecyclerView>(R.id.recyclerWeather)
        val adapter = WeatherAdapter(RepositoryObject)

        recyclerWeather.adapter = adapter

        val button = findViewById<Button>(R.id.my_button)
        button.setOnClickListener {
            Toast.makeText(this@MainActivity, "Нажата кнопка", Toast.LENGTH_SHORT).show()
            Log.i(TAG_LOG, "по кнопке")
        }
    }
}