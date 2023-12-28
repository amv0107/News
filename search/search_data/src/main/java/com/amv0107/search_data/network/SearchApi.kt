package com.amv0107.search_data.network

import com.amv0107.search_data.model.NewsRespose
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface SearchApi {

    // https://newsapi.org/v2/everything?q=apple&from=2023-12-27&to=2023-12-27&sortBy=popularity&apiKey=d9fb850902de4c908ff10ff16e3c5ff8

    @GET("everything")
    suspend fun getSearchArticles(
        @QueryMap map:MutableMap<String,String>
    ): NewsRespose
}