package com.amv0107.news.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.amv0107.new_data.room.NewsDAO
import com.amv0107.news_domain.model.Article

@Database(entities = [Article::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    companion object {
        fun getInstance(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, "app_db")
                .build()
        }
    }

    abstract fun getNewsDao(): NewsDAO
}