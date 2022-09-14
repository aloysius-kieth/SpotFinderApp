package com.example.foodnotefinderapp.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface FoodSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFoodSpot(spot: FoodSpotEntity)

    @Delete
    suspend fun deleteFoodSpot(spot: FoodSpotEntity)

    @Query("SELECT * from foodspotentity")
    fun getFoodSpots(): Flow<List<FoodSpotEntity>>
}