package info.fekri.student2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import info.fekri.student2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val apiService = ApiServiceSingleton.apiService!!

        lifecycleScope.launchWhenCreated {

            Log.v("testLog", Thread.currentThread().name)

            val data = apiService.getAllStudents()
            Log.v("testLog", data.toString())

        }

    }
}