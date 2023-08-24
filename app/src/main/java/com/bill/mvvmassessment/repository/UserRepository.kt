package com.bill.mvvmassessment.repository

import com.bill.mvvmassessment.api.ApiClient
import com.bill.mvvmassessment.api.ApiInterface
import com.bill.mvvmassessment.models.RegistrationRequest
import com.bill.mvvmassessment.models.RegistrationResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import java.net.CacheRequest

class UserRepository {
    val client = ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun registerUser(registrationRequest: RegistrationRequest):
            Response<RegistrationResponse> {
        return withContext(Dispatchers.IO) {
            client.registerUser((registrationRequest))
        }
    }

}