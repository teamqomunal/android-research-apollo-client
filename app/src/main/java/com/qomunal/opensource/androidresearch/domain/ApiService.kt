package com.qomunal.opensource.androidresearch.domain

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


interface ApiService {

    @FormUrlEncoded
    @POST("/graphql")
    suspend fun graphql(
        @Field("query") query: String,
    ): Response<ResponseBody>

}