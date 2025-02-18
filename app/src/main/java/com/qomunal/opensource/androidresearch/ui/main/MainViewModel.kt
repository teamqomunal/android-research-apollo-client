package com.qomunal.opensource.androidresearch.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.qomunal.opensource.androidresearch.common.base.BaseViewModel
import com.qomunal.opensource.androidresearch.domain.Resource
import com.qomunal.opensource.androidresearch.domain.usecase.country.CountryUseCase
import com.qomunal.opensource.androidresearch.model.CountryModel
import com.qomunal.opensource.androidresearch.model.SimpleCountryModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by faisalamircs on 13/01/2024
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */

@HiltViewModel
class MainViewModel @Inject constructor(
    private val useCase: CountryUseCase
) : BaseViewModel() {

    private var _dummiesState = MutableLiveData<List<SimpleCountryModel>>()
    var dummiesState: LiveData<List<SimpleCountryModel>> = _dummiesState

    private var _countriesState = MutableLiveData<Resource<List<CountryModel>>>()
    var countriesState: LiveData<Resource<List<CountryModel>>> = _countriesState

    fun getDummies() {
        val dummies = mutableListOf<SimpleCountryModel>()
        dummies.add(SimpleCountryModel("Indonesia", "Jakarta"))
        dummies.add(SimpleCountryModel("Malaysia", "Kuala Lumpur"))
        dummies.add(SimpleCountryModel("Singapore", "Singapore"))
        dummies.add(SimpleCountryModel("Thailand", "Bangkok"))
        dummies.add(SimpleCountryModel("Vietnam", "Hanoi"))
        _dummiesState.postValue(dummies)
    }

    fun getCountries() {
        viewModelScope.launch {
            useCase.getCountries().onEach {
                _countriesState.postValue(it)
            }.launchIn(this)
        }
    }

}