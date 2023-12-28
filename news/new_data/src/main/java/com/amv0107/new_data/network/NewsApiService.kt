package com.amv0107.new_data.network

import com.amv0107.common_utils.Constants
import com.amv0107.new_data.model.NewsRespose
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {

    // https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=d9fb850902de4c908ff10ff16e3c5ff8

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = Constants.COUNTRY,
        @Query("category") category: String = Constants.CATEGORY,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ): NewsRespose
}