package com.example.foodnotefinderapp.data.repository

import com.example.foodnotefinderapp.data.FoodSpotDao
import com.example.foodnotefinderapp.data.toFoodSpot
import com.example.foodnotefinderapp.data.toFoodSpotEntity
import com.example.foodnotefinderapp.domain.model.FoodSpot
import com.example.foodnotefinderapp.domain.repository.FoodSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class FoodSpotRepositoryImpl(
    private val dao: FoodSpotDao
) : FoodSpotRepository {

    override suspend fun insertFoodSpot(spot: FoodSpot) {
        dao.insertFoodSpot(spot.toFoodSpotEntity())
    }

    override suspend fun deleteFoodSpot(spot: FoodSpot) {
        dao.deleteFoodSpot(spot.toFoodSpotEntity())
    }

    override fun getFoodSpots(): Flow<List<FoodSpot>> {
        return dao.getFoodSpots().map { spots ->
            spots.map { it.toFoodSpot() }
        }
    }
}