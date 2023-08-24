package com.bill.mvvmassessment.models

import com.google.gson.annotations.SerializedName

data class RegistrationRequest(
    @SerializedName("user-Id")var userId: Int,
    @SerializedName("id")var id: Int,
    @SerializedName("title")var title: String,
    @SerializedName("body")var body: String,


)
