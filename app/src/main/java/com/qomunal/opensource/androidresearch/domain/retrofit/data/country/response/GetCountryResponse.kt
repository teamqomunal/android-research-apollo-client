package com.qomunal.opensource.androidresearch.domain.retrofit.data.country.response


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import com.qomunal.opensource.androidresearch.domain.CountryResponse

@Keep
data class GetCountryResponse(
    @SerializedName("country")
    var country: CountryResponse? = CountryResponse()
)