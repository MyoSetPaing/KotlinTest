package com.example.myosetpaing.kotlinsample

import com.example.myosetpaing.kotlinsample.Source.MovieRepository
import com.example.myosetpaing.kotlinsample.utils.schdulers.BaseSchedulerProvider
import com.example.myosetpaing.kotlinsample.utils.schdulers.SchedulerProvider

object Injection {
    fun provideSchedulerProvider(): BaseSchedulerProvider {
        return SchedulerProvider.getInstance()
    }

    private fun buildConfig(): DataSourceConfig {
        return DataSourceConfig
                .Builder(ApiConfig.ApiKey, ApiConfig.ApiSecret)
                .build()
    }

    fun providedMovieRepository(): MovieRepository{
        return DataSourceInjection.configureMovieRepository(buildConfig())
    }


}