package com.qomunal.opensource.androidresearch.model

import android.os.Parcelable
import androidx.annotation.Keep
import kotlinx.parcelize.Parcelize

@Parcelize
@Keep
data class SimpleCountryModel(
    var code: String = "",
    var name: String = "",
    var emoji: String = "",
    var capital: String = "",
) : Parcelable {

}
