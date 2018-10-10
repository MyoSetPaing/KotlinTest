package com.example.myosetpaing.kotlinsample.Api

import com.example.myosetpaing.kotlinsample.Model.movie.MovieApiResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface MoviesApi {

    @GET("/filippella/Sample-API-Files/master/json/movies-api.json")
    fun getMovie(): Observable<MovieApiResponse>
}