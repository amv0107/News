package com.amv0107.search_domain.di

import com.amv0107.search_domain.repository.SearchRepository
import com.amv0107.search_domain.use_cases.GetSearchArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class SearchDomainModule {

    @Provides
    fun provideSearchUseCAse(searchRepository: SearchRepository): GetSearchArticleUseCase{
        return GetSearchArticleUseCase(searchRepository)
    }
}