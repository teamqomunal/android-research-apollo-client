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
data class CountryResponse(
    @SerializedName("code")
    var code: String? = "",

    @SerializedName("name")
    var name: String? = "",

    @SerializedName("native")
    var native: String? = "",

    @SerializedName("phone")
    var phone: String? = "",

    @SerializedName("currency")
    var currency: String? = "",

    @SerializedName("emoji")
    var emoji: String? = "",

    @SerializedName("emojiU")
    var emojiU: String? = ""
)