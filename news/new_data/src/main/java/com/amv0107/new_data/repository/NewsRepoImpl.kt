package com.amv0107.new_data.repository

import com.amv0107.new_data.mapper.toDomainArticle
import com.amv0107.new_data.network.NewsApiService
import com.amv0107.new_data.room.NewsDAO
import com.amv0107.news_domain.model.Article
import com.amv0107.news_domain.repository.NewsRepository

class NewsRepoImpl(private val newsApiService: NewsApiService, private val newsDao: NewsDAO): NewsRepository {

    override suspend fun getNewsArticle(): List<Article> {
        return try {
            val temp = newsApiService.getNewsArticles().articles.map { it.toDomainArticle() }
            newsDao.insertList(temp)
            newsDao.getNewsArticle()
        } catch (e: Exception){
            newsDao.getNewsArticle()
        }
    }
}