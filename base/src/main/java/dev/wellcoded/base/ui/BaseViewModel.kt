package dev.wellcoded.base.ui

import androidx.lifecycle.ViewModel
import dev.wellcoded.base.extension.manageBy
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

abstract class BaseViewModel : ViewModel() {
    protected var disposables = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposables.dispose()
    }

    protected fun Disposable.manageByDefault() = this.manageBy(disposables)
}