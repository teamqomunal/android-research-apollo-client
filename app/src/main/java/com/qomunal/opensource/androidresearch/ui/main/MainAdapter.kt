package com.qomunal.opensource.androidresearch.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.qomunal.opensource.androidresearch.databinding.ItemMainBinding
import com.qomunal.opensource.androidresearch.model.SimpleCountry

/**
 * Created by faisalamircs on 17/02/2025
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 */


class MainAdapter : RecyclerView.Adapter<MainAdapter.MainHolder>() {

    val asyncListDiffer =
        AsyncListDiffer(this, object : DiffUtil.ItemCallback<SimpleCountry>() {
            override fun areItemsTheSame(oldItem: SimpleCountry, newItem: SimpleCountry): Boolean {
                return oldItem.code == newItem.code
            }

            override fun areContentsTheSame(
                oldItem: SimpleCountry,
                newItem: SimpleCountry,
            ): Boolean {
                return oldItem == newItem
            }
        })


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(
            ItemMainBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return asyncListDiffer.currentList.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        holder.bind(data = asyncListDiffer.currentList[position])
    }

    inner class MainHolder(private val binding: ItemMainBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: SimpleCountry) {
            binding.apply {
                tvTitle.text = data.name
            }
        }

    }

}