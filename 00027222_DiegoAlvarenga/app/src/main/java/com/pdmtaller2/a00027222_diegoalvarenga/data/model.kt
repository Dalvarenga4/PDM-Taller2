package com.pdmtaller2.a00027222_diegoalvarenga.data

import java.io.Serializable

data class Dish(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String
) : Serializable

data class Restaurant(
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
) : Serializable