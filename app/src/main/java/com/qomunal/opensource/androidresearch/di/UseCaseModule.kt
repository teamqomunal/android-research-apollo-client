package com.qomunal.opensource.androidresearch.di

import com.qomunal.opensource.androidresearch.domain.retrofit.usecase.country.CountryInteractor
import com.qomunal.opensource.androidresearch.domain.retrofit.usecase.country.CountryUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


@Module
@InstallIn(ViewModelComponent::class)
abstract class UseCaseModule {

    @Binds
    @ViewModelScoped
    abstract fun provideCountryUseCase(useCase: CountryInteractor): CountryUseCase

}