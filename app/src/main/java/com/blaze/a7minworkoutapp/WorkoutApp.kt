package com.blaze.a7minworkoutapp

import android.app.Application

class WorkoutApp:Application() {
    val db by lazy{
        HistoryDatabase.getInstance(this)
    }
}