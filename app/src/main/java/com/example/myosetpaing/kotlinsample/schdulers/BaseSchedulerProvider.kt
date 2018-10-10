package com.example.myosetpaing.kotlinsample.utils.schdulers

import io.reactivex.Scheduler

interface BaseSchedulerProvider {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}