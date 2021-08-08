package ru.kostrykt.gb_ak_les1.repository

import ru.kostrykt.gb_ak_les1.data.Weather

interface IRepository {
    fun getWeathers(): List<Weather>
}