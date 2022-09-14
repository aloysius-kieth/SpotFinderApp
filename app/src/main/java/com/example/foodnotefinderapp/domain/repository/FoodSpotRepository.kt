package com.example.foodnotefinderapp.domain.repository

import com.example.foodnotefinderapp.domain.model.FoodSpot
import kotlinx.coroutines.flow.Flow

interface FoodSpotRepository {

    suspend fun insertFoodSpot(spot: FoodSpot)
    suspend fun deleteFoodSpot(spot: FoodSpot)
    fun getFoodSpots(): Flow<List<FoodSpot>>
}