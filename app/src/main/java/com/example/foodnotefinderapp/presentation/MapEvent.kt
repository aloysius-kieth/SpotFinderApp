package com.example.foodnotefinderapp.presentation

import com.example.foodnotefinderapp.domain.model.FoodSpot
import com.google.android.gms.maps.model.LatLng

sealed class MapEvent {
    object ToggleFalloutMap : MapEvent()
    data class OnMapLongClick(val latLng: LatLng) : MapEvent()
    data class OnInfoWindowLongClick(val spot: FoodSpot) : MapEvent()
}
