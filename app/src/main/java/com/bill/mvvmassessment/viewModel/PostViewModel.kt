package com.bill.mvvmassessment.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bill.mvvmassessment.models.RegistrationRequest
import com.bill.mvvmassessment.models.RegistrationResponse
import com.bill.mvvmassessment.repository.UserRepository
import kotlinx.coroutines.launch

class PostViewModel : ViewModel() {
    var regisLiveData = MutableLiveData<RegistrationResponse>()
    var regError = MutableLiveData<String>()
    var userRepo = UserRepository()

    fun registerUser(registrationRequest: RegistrationRequest){
        viewModelScope.launch{
            val response = userRepo.registerUser(registrationRequest)
            if(response.isSuccessful){
                regisLiveData.postValue(response.body())
            }
            else{
                regError.postValue(response.errorBody()?.string())
            }
        }
    }

}