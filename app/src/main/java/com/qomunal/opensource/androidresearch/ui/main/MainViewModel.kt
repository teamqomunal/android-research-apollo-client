package com.qomunal.opensource.androidresearch.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.qomunal.opensource.androidresearch.common.base.BaseViewModel
import com.qomunal.opensource.androidresearch.model.SimpleCountry
import dagger.hilt.android.lifecycle.HiltViewModel
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
class MainViewModel @Inject constructor() : BaseViewModel() {

    private var _dummiesState = MutableLiveData<List<SimpleCountry>>()
    var dummiesState: LiveData<List<SimpleCountry>> = _dummiesState

    fun getDummies() {
        val dummies = mutableListOf<SimpleCountry>()
        dummies.add(SimpleCountry("Indonesia", "Jakarta"))
        dummies.add(SimpleCountry("Malaysia", "Kuala Lumpur"))
        dummies.add(SimpleCountry("Singapore", "Singapore"))
        dummies.add(SimpleCountry("Thailand", "Bangkok"))
        dummies.add(SimpleCountry("Vietnam", "Hanoi"))
        _dummiesState.postValue(dummies)
    }

}