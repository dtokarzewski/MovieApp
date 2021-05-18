package dev.wellcoded.base.util

interface Logger {

    fun init(isDebug: Boolean)

    fun v(message: String, vararg args: Any?)

    fun d(message: String, vararg args: Any?)

    fun w(message: String, vararg args: Any?)

    fun w(throwable: Throwable)

    fun e(message: String, vararg args: Any?)

    fun e(throwable: Throwable)
}