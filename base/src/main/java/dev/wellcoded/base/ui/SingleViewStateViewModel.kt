package dev.wellcoded.base.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class SingleViewStateViewModel<ViewState>() : BaseViewModel() {

    constructor(initialViewState: ViewState?) : this() {
        initialViewState?.let {
            _viewState.value = it
        }
    }

    val viewState: LiveData<ViewState>
        get() = _viewState
    private val _viewState = MutableLiveData<ViewState>()

    protected fun changeViewState(block: (ViewState?) -> ViewState) {
        _viewState.value = block.invoke(_viewState.value)
    }
}