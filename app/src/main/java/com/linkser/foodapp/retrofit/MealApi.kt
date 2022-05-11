package com.linkser.foodapp.retrofit

import com.linkser.foodapp.pojo.CategoryList
import com.linkser.foodapp.pojo.MealsByCategoryList
import com.linkser.foodapp.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {
    @GET("random.php")
    fun getRandomMeal():Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id: String): Call<MealList>

    @GET("filter.php?")
    fun getMostPopularMeals(@Query("c") categoryName: String): Call<MealsByCategoryList>

    @GET("categories.php")
    fun getCategories(): Call<CategoryList>
}