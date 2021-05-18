package dev.wellcoded.myapplication.util

import dev.wellcoded.base.util.Logger
import timber.log.Timber

class TimberLogger : Logger {

    override fun init(isDebug: Boolean) {
        if (isDebug) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun v(message: String, vararg args: Any?) {
        Timber.v(message, args)
    }

    override fun d(message: String, vararg args: Any?) {
        Timber.d(message, args)
    }

    override fun w(message: String, vararg args: Any?) {
        Timber.w(message, args)
    }

    override fun w(throwable: Throwable) {
        Timber.w(throwable)
    }

    override fun e(message: String, vararg args: Any?) {
        Timber.w(message, args)
    }

    override fun e(throwable: Throwable) {
        Timber.e(throwable)
    }
}