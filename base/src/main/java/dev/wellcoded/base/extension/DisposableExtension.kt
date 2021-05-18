package dev.wellcoded.base.extension

import io.reactivex.rxjava3.disposables.Disposable
import io.reactivex.rxjava3.disposables.DisposableContainer

fun Disposable.manageBy(disposableContainer: DisposableContainer) = apply {
    disposableContainer.add(this)
}