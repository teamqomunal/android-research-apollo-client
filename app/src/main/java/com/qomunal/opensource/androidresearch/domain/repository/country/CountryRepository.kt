package com.qomunal.opensource.androidresearch.domain.repository.country

import com.qomunal.opensource.androidresearch.domain.Resource
import com.qomunal.opensource.androidresearch.domain.data.country.CountryDataSource
import com.qomunal.opensource.androidresearch.domain.data.country.CountryMapper
import com.qomunal.opensource.androidresearch.model.CountryModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


class CountryRepository @Inject constructor(
    private val dataSource: CountryDataSource,
) : ICountryRepository {

    override suspend fun getCountries(): Flow<Resource<List<CountryModel>>> {
        return dataSource.getCountries().map {
            return@map when (it) {
                is Resource.Success -> Resource.Success(
                    it.data?.let { domain ->
                        domain.countries?.map { country ->
                            CountryMapper.responseToDomain(country)
                        }
                    } ?: listOf()
                )
                is Resource.Error -> Resource.Error(it.message.toString())
                is Resource.Loading -> Resource.Loading()
            }
        }
    }

    override suspend fun getCountry(code: String): Flow<Resource<CountryModel>> {
        return dataSource.getCountry(code).map {
            return@map when (it) {
                is Resource.Success -> Resource.Success(
                    it.data?.let { domain ->
                        domain.country?.let { country ->
                            CountryMapper.responseToDomain(country)
                        }
                    } ?: CountryModel()
                )
                is Resource.Error -> Resource.Error(it.message.toString())
                is Resource.Loading -> Resource.Loading()
            }
        }
    }

}