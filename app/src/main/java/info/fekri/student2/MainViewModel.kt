package info.fekri.student2

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers

class MainViewModel: ViewModel() {

    init {
        val apiService = ApiServiceSingleton.apiService!!

        viewModelScope.launch(Dispatchers.IO) {
            val data = apiService.getAllStudents()
            Log.v("testLog", data.toString())
        }
    }


}