package com.qomunal.opensource.androidresearch.domain.data.country

import com.qomunal.opensource.androidresearch.common.ext.fromJson
import com.qomunal.opensource.androidresearch.domain.ApiService
import com.qomunal.opensource.androidresearch.domain.GraphqlResponse
import com.qomunal.opensource.androidresearch.domain.Resource
import com.qomunal.opensource.androidresearch.domain.data.country.graphql.CountryGraphQL
import com.qomunal.opensource.androidresearch.domain.data.country.response.GetCountriesResponse
import com.qomunal.opensource.androidresearch.domain.data.country.response.GetCountryResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */

@Singleton
class CountryDataSource @Inject constructor(
    private val apiService: ApiService,
) {

    suspend fun getCountries(): Flow<Resource<GetCountriesResponse>> = flow {
        try {
            emit(Resource.Loading())
            val request = apiService.graphql(CountryGraphQL.getCountries())
            val response = fromJson<GraphqlResponse<GetCountriesResponse>>(request.body()?.string())
            if (response.isError()) {
                emit(Resource.Error(response.getErrorMessage()))
            } else {
                emit(Resource.Success(response.data ?: GetCountriesResponse()))
            }
        } catch (e: Exception) {

            emit(Resource.Error(e.message.toString()))
        }
    }.flowOn(Dispatchers.IO)

    suspend fun getCountry(code: String): Flow<Resource<GetCountryResponse>> = flow {
        try {
            emit(Resource.Loading())
            val request = apiService.graphql(CountryGraphQL.getCountry(code))
            val response = fromJson<GraphqlResponse<GetCountryResponse>>(request.body()?.string())
            if (response.isError()) {
                emit(Resource.Error(response.getErrorMessage()))
            } else {
                emit(Resource.Success(response.data ?: GetCountryResponse()))
            }
        } catch (e: Exception) {

            emit(Resource.Error(e.message.toString()))
        }
    }.flowOn(Dispatchers.IO)

}