package com.bill.mvvmassessment.repository

import com.bill.mvvmassessment.api.ApiClient
import com.bill.mvvmassessment.api.ApiInterface
import com.bill.mvvmassessment.models.RegistrationResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.net.CacheRequest

class UserRepository {
    val apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun registerUser(registrationRequest: RegistrationRequest):
            Response<RegistrationResponse> = withContext(Dispatchers.IO){
                var respo = apiInterface.registerUser(registrationRequest)
                return@withContext respo
    }

}