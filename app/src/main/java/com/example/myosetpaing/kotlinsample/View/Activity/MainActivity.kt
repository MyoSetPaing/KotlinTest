package com.example.myosetpaing.kotlinsample.View.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import com.example.myosetpaing.kotlinsample.Injection

import com.example.myosetpaing.kotlinsample.Model.movie.Movie
import com.example.myosetpaing.kotlinsample.Presenter.Movie.MovieContract
import com.example.myosetpaing.kotlinsample.Presenter.Movie.MoviePresenter
import com.example.myosetpaing.kotlinsample.R
import com.example.myosetpaing.kotlinsample.View.Adapter.MovieAdapter

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() , MovieContract.View  {

    private lateinit var presenter: MoviePresenter


    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        movieAdapter = MovieAdapter()
        movies_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        movies_list.adapter = movieAdapter
        presenter.getMovie()
    }

    private fun init(){
        MoviePresenter(this,Injection.providedMovieRepository(),Injection.provideSchedulerProvider())
    }
    override fun showMovieList(data: List<Movie>) {
        movieAdapter.setMovies(data)

    }

    override fun setPresenter(presenter: MovieContract.Presenter) {
        this.presenter=presenter as MoviePresenter
    }

    override fun setLoadingIndicator(active: Boolean) {
    }

    override fun showError(message: String) {
    }


}