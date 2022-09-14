package com.example.foodnotefinderapp.data

import com.example.foodnotefinderapp.domain.model.FoodSpot

fun FoodSpotEntity.toFoodSpot(): FoodSpot {
    return FoodSpot(
        lat = lat,
        log = log,
        id = id
    )
}

fun FoodSpot.toFoodSpotEntity(): FoodSpotEntity {
    return FoodSpotEntity(
        lat = lat,
        log = log,
        id = id
    )
}