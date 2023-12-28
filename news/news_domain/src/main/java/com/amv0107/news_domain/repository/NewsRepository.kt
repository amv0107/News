package com.amv0107.news_domain.repository

import com.amv0107.news_domain.model.Article

interface NewsRepository {

    suspend fun getNewsArticle(): List<Article>
}