package com.example.foodnotefinderapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [FoodSpotEntity::class],
    version = 1
)
abstract class FoodSpotDatabase : RoomDatabase() {
    abstract val dao: FoodSpotDao
}