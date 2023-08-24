package com.bill.mvvmassessment.api

import com.bill.mvvmassessment.models.RegistrationRequest
import com.bill.mvvmassessment.models.RegistrationResponse

interface ApiInterface {
    @POST("/students/register")
    suspend fun registerStudent(@Body registrationRequest:
                                RegistrationRequest
    ): Response<RegistrationResponse>

}