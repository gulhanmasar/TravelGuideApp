package com.gulhan.travelguideapp.domain.model.allList

import java.io.Serializable

data class TravelsItem(
    val category: String,
    val city: String,
    val country: String,
    val description: String,
    val id: String,
    val images: List<Image>,
    val isBookmark: Boolean,
    val title: String
):Serializable