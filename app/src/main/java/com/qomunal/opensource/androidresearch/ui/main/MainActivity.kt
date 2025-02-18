package com.qomunal.opensource.androidresearch.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.qomunal.opensource.androidresearch.common.base.BaseActivity
import com.qomunal.opensource.androidresearch.common.ext.showToast
import com.qomunal.opensource.androidresearch.databinding.ActivityMainBinding
import com.qomunal.opensource.androidresearch.domain.retrofit.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val viewModel: MainViewModel by viewModels()

    private val mAdapter: MainAdapter by lazy {
        MainAdapter()
    }
    private val router: MainRouter by lazy {
        MainRouter(this)
    }

    override fun setupViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCountries()
    }

    override fun initUI() {
        binding.apply {
            rv.adapter = mAdapter
            rv.layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL, false)
        }
    }

    override fun initObserver() {
        viewModel.apply {

            countriesState.observe(this@MainActivity) {
                when (it) {
                    is Resource.Loading -> {
                        showToast("Loading")
                    }
                    is Resource.Success -> {
                        it.data?.let { countries ->
                            mAdapter.asyncListDiffer.submitList(countries.toMutableList())
                        }
                    }
                    is Resource.Error -> {
                        showToast(it.message.toString())
                    }
                }
            }
        }
    }

}