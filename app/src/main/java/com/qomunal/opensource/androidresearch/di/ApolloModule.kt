package com.qomunal.opensource.androidresearch.di

import com.apollographql.apollo.ApolloClient
import com.qomunal.opensource.androidresearch.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by faisalamircs on 18/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


@Module
@InstallIn(SingletonComponent::class)
object ApolloModule {

    @Provides
    @Singleton
    fun provideApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl(Constant.BASE_URL_GRAPHQL)
            .build()
    }

//    @Provides
//    @Singleton
//    fun provideCountryClient(apolloClient: ApolloClient): CountryClient {
//        return ApolloCountryClient(apolloClient)
//    }

}