package com.example.foodnotefinderapp.di

import android.app.Application
import androidx.room.Room
import com.example.foodnotefinderapp.data.FoodSpotDatabase
import com.example.foodnotefinderapp.data.repository.FoodSpotRepositoryImpl
import com.example.foodnotefinderapp.domain.repository.FoodSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideFoodSpotDatabase(app: Application): FoodSpotDatabase =
        Room.databaseBuilder(app, FoodSpotDatabase::class.java, "food_spots_db")
            .build()

    @Provides
    @Singleton
    fun provideFoodSpotRepository(db: FoodSpotDatabase): FoodSpotRepository =
        FoodSpotRepositoryImpl(db.dao)
}