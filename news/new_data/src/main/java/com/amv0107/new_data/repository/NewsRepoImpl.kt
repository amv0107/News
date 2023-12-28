package com.amv0107.new_data.repository

import com.amv0107.new_data.mapper.toDomainArticle
import com.amv0107.new_data.network.NewsApiService
import com.amv0107.news_domain.model.Article
import com.amv0107.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService): NewsRepository {

    override suspend fun getNewsArticle(): List<Article> {
        return newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
    }
}