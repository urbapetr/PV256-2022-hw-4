package cz.muni.fi.pv256.hw4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// TODO use SavedStateHandle
class MainActivityViewModel : ViewModel(), Counter {
    companion object {
        private const val KEY_COUNT = "key_count"
    }

    private val _count: MutableLiveData<Int> by lazy {
        // TODO initialize with saved value
        MutableLiveData<Int>().apply { value = 0 }
    }

    val data: LiveData<Int>
        get() = _count

    override fun incrementCount() {
        TODO("Not yet implemented")
    }

    override fun decrementCount() {
        TODO("Not yet implemented")
    }

    /**
     * Use this function for saving state
     */
    private fun saveCountState() {
        TODO("Not yet implemented")
    }
}
