package ru.kostrykt.gb_ak_les1.repository

import ru.kostrykt.gb_ak_les1.data.Weather

class Repository : IRepository {

    private val weathers: List<Weather> = listOf(
        Weather("Москва", 25),
        Weather("Санкт-Петербург", 20),
        Weather("Самара", 23),
        Weather("Новосибирск", 15)
    )

    override fun getWeathers(): List<Weather> {
        return weathers
    }
}