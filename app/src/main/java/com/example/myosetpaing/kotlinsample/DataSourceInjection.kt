package com.example.myosetpaing.kotlinsample

import com.example.myosetpaing.kotlinsample.Source.MovieRepository
import com.example.myosetpaing.kotlinsample.Source.Remote.MovieRemoteDataSource

object DataSourceInjection{
       fun configureMovieRepository(config: DataSourceConfig): MovieRepository{
           return MovieRepository.getInstance(MovieRemoteDataSource.getInstance(config))
       }
}