package com.qomunal.opensource.androidresearch.domain.retrofit.data.country.graphql

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


object CountryGraphQL {

    fun defaultReturn() : String {
        return """
            code
            name
            native
            phone
            currency
            emoji
            emojiU
        """.trimIndent()
    }

    fun getCountries() : String {
        return """
            {
              countries {
                ${defaultReturn()}
              }
            }
        """.trimIndent()
    }

    fun getCountry(code: String): String {
        return """
            {
              country(code: "$code") {
                ${defaultReturn()}
              }
            }

        """.trimIndent()
    }

}