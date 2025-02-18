package com.qomunal.opensource.androidresearch.common.ext

import com.google.gson.JsonObject

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


fun graphqlBody(query : String) : JsonObject {
    return JsonObject().apply {
        addProperty("query",  query)
    }
}