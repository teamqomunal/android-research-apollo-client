package com.qomunal.opensource.androidresearch.domain.repository.country

import com.qomunal.opensource.androidresearch.domain.Resource
import com.qomunal.opensource.androidresearch.model.CountryModel
import kotlinx.coroutines.flow.Flow

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


interface ICountryRepository {

    suspend fun getCountries(): Flow<Resource<List<CountryModel>>>

    suspend fun getCountry(code: String): Flow<Resource<CountryModel>>

}