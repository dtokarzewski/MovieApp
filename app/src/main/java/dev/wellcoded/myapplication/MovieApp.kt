package dev.wellcoded.myapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import dev.wellcoded.base.initializer.Initializer
import javax.inject.Inject

@HiltAndroidApp
class MovieApp : Application() {
    @Inject lateinit var initializers: Set<@JvmSuppressWildcards Initializer>
}