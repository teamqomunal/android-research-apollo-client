package com.qomunal.opensource.androidresearch.domain

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
data class GraphqlResponse<T>(
    @SerializedName("data")
    val data: T?,
    @SerializedName("errors")
    val error: List<GraphqlError>?,
) {
    fun isError(): Boolean = !error.isNullOrEmpty()

    fun getErrorMessage(): String {
        val message = error?.first()?.message
        val validationMap = error?.first()?.extension?.validation
        return if (validationMap != null) {
            val (_, value) = validationMap.entries.iterator().next()
            value.first()
        } else {
            message!!
        }
    }


    @Keep
    data class GraphqlError(
        @SerializedName("message")
        val message: String?,

        @SerializedName("extensions")
        val extension: GraphqlErrorValidation,
    ) {
        @Keep
        data class GraphqlErrorValidation(
            @SerializedName("validation")
            val validation: Map<String, List<String>>?,

            @SerializedName("category")
            val category: String?,
        )
    }

}