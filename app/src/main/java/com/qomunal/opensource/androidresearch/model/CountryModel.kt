package com.qomunal.opensource.androidresearch.model

import android.os.Parcelable
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */

@Parcelize
@Keep
data class CountryModel(
    var code: String = "",
    var name: String = "",
    var native: String = "",
    var phone: String = "",
    var currency: String = "",
    var emoji: String = "",
    var emojiU: String = "",
) : Parcelable {

}