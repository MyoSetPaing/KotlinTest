package com.example.myosetpaing.kotlinsample.Source

import com.example.myosetpaing.kotlinsample.Model.movie.MovieApiResponse
import io.reactivex.Observable

class MovieRepository(private val movieRemoteDataSource: MovieDataSource):MovieDataSource{

    companion object {
        fun getInstance(movieRemoteDataSource: MovieDataSource): MovieRepository{
            return MovieRepository(movieRemoteDataSource)
        }
    }
    override fun getMovies(): Observable<MovieApiResponse> {
        return movieRemoteDataSource.getMovies()
    }


}