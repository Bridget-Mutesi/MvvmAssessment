package com.bill.mvvmassessment.api

import com.bill.mvvmassessment.models.RegistrationRequest
import com.bill.mvvmassessment.models.RegistrationResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/user/register")
    suspend fun registerUser(
        @Body registrationRequest: RegistrationRequest
    ): Response<RegistrationResponse>

}