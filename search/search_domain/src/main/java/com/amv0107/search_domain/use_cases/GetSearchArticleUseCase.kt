package com.amv0107.search_domain.use_cases

import com.amv0107.common_utils.Resource
import com.amv0107.search_domain.model.Article
import com.amv0107.search_domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetSearchArticleUseCase(private val repository: SearchRepository) {

    operator fun invoke(map: MutableMap<String, String>): Flow<Resource<List<Article>>> = flow{

        emit(Resource.Loading())
        try {
            emit(Resource.Success(repository.getSearchArticles(map)))
        } catch (e: Exception){
            emit(Resource.Error(e.message.toString()))
        }
    }


}