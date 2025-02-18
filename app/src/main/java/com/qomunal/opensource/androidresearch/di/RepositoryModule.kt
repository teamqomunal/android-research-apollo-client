package com.qomunal.opensource.androidresearch.di

import com.qomunal.opensource.androidresearch.domain.retrofit.repository.country.CountryRepository
import com.qomunal.opensource.androidresearch.domain.retrofit.repository.country.ICountryRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


@Module(includes = [RetrofitModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideCountryRepository(repository: CountryRepository): ICountryRepository



}