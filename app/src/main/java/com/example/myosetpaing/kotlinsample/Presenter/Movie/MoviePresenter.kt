package com.example.myosetpaing.kotlinsample.Presenter.Movie

import com.example.myosetpaing.kotlinsample.Source.MovieDataSource
import com.example.myosetpaing.kotlinsample.utils.schdulers.BaseSchedulerProvider
import io.reactivex.disposables.CompositeDisposable

class MoviePresenter(var view: MovieContract.View,
                     var movieDataSource: MovieDataSource,
                     var baseSchedulerProvider: BaseSchedulerProvider
): MovieContract.Presenter{

    var compositeDisposable = CompositeDisposable()

    init {
        this.view.setPresenter(this)
    }
    override fun getMovie() {
        compositeDisposable.add(
                movieDataSource.getMovies()
                        .subscribeOn(baseSchedulerProvider.computation())
                        .observeOn(baseSchedulerProvider.ui())
                        .subscribe({ movieApiResponse ->
                            view.showMovieList(movieApiResponse.data)
                        }, { e ->
                            e.printStackTrace()
                            view.showError(e.localizedMessage)
                        }
                        )

    )
    }

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsbuscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}