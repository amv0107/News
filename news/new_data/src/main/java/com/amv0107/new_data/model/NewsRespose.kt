package com.amv0107.new_data.model

data class NewsRespose(
    val articles: List<ArticleDTO>,
    val status: String,
    val totalResults: Int
)