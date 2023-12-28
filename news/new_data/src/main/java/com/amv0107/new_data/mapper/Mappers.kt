package com.amv0107.new_data.mapper

import com.amv0107.new_data.model.ArticleDTO
import com.amv0107.news_domain.model.Article

fun ArticleDTO.toDomainArticle(): Article{
    return Article(
        author = this.author?:"",
        content = this.content?:"",
        description = this.description?:"",
        title = this.title?:"",
        urlToImage = this.urlToImage?:""
    )
}