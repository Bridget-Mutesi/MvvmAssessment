package com.bill.mvvmassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.bill.mvvmassessment.databinding.ActivityMainBinding
import com.bill.mvvmassessment.viewModel.PostViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val userViewModel: PostViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    override fun onResume() {
        super.onResume()
        userViewModel.regisLiveData.observe(this, Observer { response->
            Toast.makeText(baseContext, "Regitration successful", Toast.LENGTH_LONG).show()
        })
        userViewModel.regError.observe(this, Observer { str->
            Toast.makeText(baseContext, str, Toast.LENGTH_LONG).show()
        })
    }
}