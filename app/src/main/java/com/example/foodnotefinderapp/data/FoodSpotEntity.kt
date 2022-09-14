package com.example.foodnotefinderapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class FoodSpotEntity(
    val lat: Double,
    val log: Double,

    @PrimaryKey val id: Int? = null
)
