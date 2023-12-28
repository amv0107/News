package com.amv0107.news_domain.di

import com.amv0107.news_domain.repository.NewsRepository
import com.amv0107.news_domain.use_case.GetNewsArticleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NewsDomainModule {

    @Provides
    fun provideGetNewsUSeCAse(newsRepository: NewsRepository): GetNewsArticleUseCase{
        return GetNewsArticleUseCase(newsRepository)
    }

}