package com.projects.enzoftware.nutricoach.model

data class Recipe (val recipeId : String,
                   val title : String,
                   val imageUrl : String?,
                   val f2fUrl: String?,
                   val publisher: String?,
                   val publisherUrl: String?,
                   val socialRank: Double,
                   val sourceUrl : String?,
                   var isFavorite : Boolean)