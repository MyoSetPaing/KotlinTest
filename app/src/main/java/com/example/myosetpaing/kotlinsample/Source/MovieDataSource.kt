package com.example.myosetpaing.kotlinsample.Source

import com.example.myosetpaing.kotlinsample.Model.movie.MovieApiResponse
import io.reactivex.Observable

interface MovieDataSource {

        fun getMovies(): Observable<MovieApiResponse>
}