package com.example.foodnotefinderapp.presentation

import com.example.foodnotefinderapp.domain.model.FoodSpot
import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings

data class MapState(
    val mapProperties: MapProperties = MapProperties(),
    val uiSettings: MapUiSettings = MapUiSettings(zoomControlsEnabled = false),
    val isFalloutMap: Boolean = false,
    val foodSpots: List<FoodSpot> = emptyList()
)
