package dev.wellcoded.base.initializer

import android.app.Application

interface Initializer {
    fun init(application: Application)
}