package com.example.myosetpaing.kotlinsample.Presenter.Movie

import com.example.myosetpaing.kotlinsample.Model.movie.Movie
import com.example.myosetpaing.kotlinsample.Presenter.BasePresenter.BasePresenter
import com.example.myosetpaing.kotlinsample.Presenter.BaseView.BaseView

class MovieContract{
    interface View : BaseView<Presenter>{
        fun showMovieList(data: List<Movie>)
    }
    interface Presenter: BasePresenter{
        fun getMovie()

    }
}