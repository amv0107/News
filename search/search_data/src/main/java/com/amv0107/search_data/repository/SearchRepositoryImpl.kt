package com.amv0107.search_data.repository

import com.amv0107.search_data.mapper.toDomainArticle
import com.amv0107.search_data.network.SearchApi
import com.amv0107.search_domain.model.Article
import com.amv0107.search_domain.repository.SearchRepository

class SearchRepositoryImpl(private val searchApi: SearchApi): SearchRepository {

    override suspend fun getSearchArticles(map: MutableMap<String, String>): List<Article> {
        return searchApi.getSearchArticles(map).articles.map { it.toDomainArticle() }
    }
}