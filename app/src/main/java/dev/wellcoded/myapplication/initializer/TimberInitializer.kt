package dev.wellcoded.myapplication.initializer

import android.app.Application
import dev.wellcoded.base.initializer.Initializer
import dev.wellcoded.myapplication.BuildConfig
import dev.wellcoded.myapplication.util.TimberLogger
import javax.inject.Inject

class TimberInitializer @Inject constructor(
    private val timberLogger: TimberLogger
) : Initializer {

    override fun init(application: Application) {
        timberLogger.init(BuildConfig.DEBUG)
    }
}