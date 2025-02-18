package com.qomunal.opensource.androidresearch.domain.retrofit.usecase.country

import com.qomunal.opensource.androidresearch.domain.retrofit.Resource
import com.qomunal.opensource.androidresearch.domain.retrofit.repository.country.ICountryRepository
import com.qomunal.opensource.androidresearch.model.CountryModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


class CountryInteractor @Inject constructor(
    private val repository: ICountryRepository,
) : CountryUseCase {

    override suspend fun getCountries(): Flow<Resource<List<CountryModel>>> {
        return repository.getCountries()
    }

    override suspend fun getCountry(code: String): Flow<Resource<CountryModel>> {
        return repository.getCountry(code)
    }

}