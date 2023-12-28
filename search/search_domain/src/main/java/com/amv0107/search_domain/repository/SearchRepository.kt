package com.amv0107.search_domain.repository

import com.amv0107.search_domain.model.Article

interface SearchRepository {

    suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article>
}