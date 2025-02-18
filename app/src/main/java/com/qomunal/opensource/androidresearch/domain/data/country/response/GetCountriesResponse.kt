package com.qomunal.opensource.androidresearch.domain.data.country.response

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


@Keep
data class GetCountriesResponse(
    @SerializedName("countries")
    var countries: List<CountryResponse>? = listOf()
)