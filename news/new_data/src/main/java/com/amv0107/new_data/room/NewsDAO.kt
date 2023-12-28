package com.amv0107.new_data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.amv0107.news_domain.model.Article

@Dao
interface NewsDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(list: List<Article>)

    @Query("SELECT * FROM Article")
    suspend fun getNewsArticle(): List<Article>
}