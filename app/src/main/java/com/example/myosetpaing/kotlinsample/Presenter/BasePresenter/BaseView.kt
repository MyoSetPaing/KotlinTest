package com.example.myosetpaing.kotlinsample.Presenter.BaseView


interface BaseView<T> {
    fun setPresenter(presenter: T)

    fun setLoadingIndicator(active: Boolean)

    fun showError(message: String)
}