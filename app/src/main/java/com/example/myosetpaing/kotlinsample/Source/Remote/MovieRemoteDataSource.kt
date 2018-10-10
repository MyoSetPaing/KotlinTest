package com.example.myosetpaing.kotlinsample.Source.Remote

import com.example.myosetpaing.kotlinsample.Api.MoviesApi
import com.example.myosetpaing.kotlinsample.DataSourceConfig
import com.example.myosetpaing.kotlinsample.Model.movie.MovieApiResponse
import com.example.myosetpaing.kotlinsample.Source.MovieDataSource
import io.reactivex.Observable
import retrofit2.Retrofit

class MovieRemoteDataSource(private val config: DataSourceConfig) : MovieDataSource {

    companion object {
        fun getInstance(config: DataSourceConfig): MovieRemoteDataSource {
            return MovieRemoteDataSource(config)
        }
    }

    override fun getMovies(): Observable<MovieApiResponse> {
        return provideMovieApi().getMovie()
    }

    fun provideMovieApi(): MoviesApi {
        val retrofit: Retrofit = config.getRetrofit()
        return retrofit.create(MoviesApi::class.java)
    }
}