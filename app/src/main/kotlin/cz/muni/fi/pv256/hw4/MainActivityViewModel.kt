package cz.muni.fi.pv256.hw4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

// TODO use SavedStateHandle
class MainActivityViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel(), Counter {
    companion object {
        private const val KEY_COUNT = "key_count"
    }

    private val _count: MutableLiveData<Int> by lazy {
        // TODO initialize with saved value
        MutableLiveData<Int>().apply {
            value = savedStateHandle[KEY_COUNT] ?: 0
        }
    }

    val data: LiveData<Int>
        get() = _count

    override fun incrementCount() {
        // TODO
        _count.value?.let { a ->
            _count.value = a + 1
        }
        saveCountState()
    }

    override fun decrementCount() {
        // TODO
        _count.value?.let { a ->
            _count.value = a - 1
        }
        saveCountState()
    }

    /**
     * Use this function for saving state
     */
    private fun saveCountState() {
        // TODO
        savedStateHandle[KEY_COUNT] = _count.value
    }
}
