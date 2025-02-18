package com.qomunal.opensource.androidresearch.domain

import com.qomunal.opensource.androidresearch.model.CountryModel

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


object CountryMapper {

    fun responseToDomain(response: CountryResponse): CountryModel {
        return CountryModel(
            code = response.code ?: "",
            name = response.name ?: "",
            native = response.native ?: "",
            phone = response.phone ?: "",
            currency = response.currency ?: "",
            emoji = response.emoji ?: "",
            emojiU = response.emojiU ?: "",
        )
    }

}