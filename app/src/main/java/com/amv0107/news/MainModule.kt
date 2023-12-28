package com.amv0107.news

import android.content.Context
import com.amv0107.common_utils.Navigator
import com.amv0107.new_data.room.NewsDAO
import com.amv0107.news.navigation.DefaultNavigator
import com.amv0107.news.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {

    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Provides
    fun provideNewsDAO(appDatabase: AppDatabase): NewsDAO {
        return appDatabase.getNewsDao()
    }
}