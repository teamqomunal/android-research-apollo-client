package com.qomunal.opensource.androidresearch.domain.data.country.response


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class GetCountryResponse(
    @SerializedName("country")
    var country: CountryResponse? = CountryResponse()
)