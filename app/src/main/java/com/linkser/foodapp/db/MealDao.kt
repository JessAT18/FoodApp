package com.linkser.foodapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.linkser.foodapp.pojo.Meal

@Dao
interface MealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE) //OnConflict lets insert new values or update if value exists
    //suspend for not interrupting thread
    suspend fun upsert(meal: Meal)

//    @Update
//    suspend fun updateMeal(meal: Meal)

    @Delete
    suspend fun delete(meal: Meal)

    @Query("SELECT * FROM mealInformation")
    fun getAllMeals(): LiveData<List<Meal>>
}