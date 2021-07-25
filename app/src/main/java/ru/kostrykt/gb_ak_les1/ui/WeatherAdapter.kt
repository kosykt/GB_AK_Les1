package ru.kostrykt.gb_ak_les1.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.kostrykt.gb_ak_les1.R
import ru.kostrykt.gb_ak_les1.data.Weather
import ru.kostrykt.gb_ak_les1.repository.IRepository

class WeatherAdapter(private val repository: IRepository) :
    RecyclerView.Adapter<WeatherAdapter.WeatherVeiwHolder>() {

    class WeatherVeiwHolder(item: View) : RecyclerView.ViewHolder(item) {

        private val city: TextView
        private val temperature: TextView

        init {
            city = item.findViewById(R.id.textCity)
            temperature = item.findViewById(R.id.textTemperature)
        }

        fun bind(weather: Weather) {
            city.text = weather.cityName
            temperature.text = weather.temperature.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherVeiwHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return WeatherVeiwHolder(view)
    }

    override fun onBindViewHolder(holder: WeatherVeiwHolder, position: Int) {
        holder.bind(repository.getWeathers()[position])
    }

    override fun getItemCount(): Int {
        return repository.getWeathers().size
    }

}