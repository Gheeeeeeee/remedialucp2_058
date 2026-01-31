package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.remedialucp2_058.repository.ContainerApp

class ViewModelFactory(
    private val container: ContainerApp
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(BukuViewModel::class.java) ->
                BukuViewModel(container.bukuRepository()) as T

            modelClass.isAssignableFrom(BukuEntryViewModel::class.java) ->
                BukuEntryViewModel(container.bukuRepository()) as T

            modelClass.isAssignableFrom(BukuEditViewModel::class.java) ->
                BukuEditViewModel(container.bukuRepository()) as T

            modelClass.isAssignableFrom(KategoriViewModel::class.java) ->
                KategoriViewModel(container.kategoriRepository()) as T

            modelClass.isAssignableFrom(KategoriEntryViewModel::class.java) ->
                KategoriEntryViewModel(container.kategoriRepository()) as T

            modelClass.isAssignableFrom(KategoriEditViewModel::class.java) ->
                KategoriEditViewModel(container.kategoriRepository()) as T

            else -> throw IllegalArgumentException("Unknown ViewModel")
        }
    }
}
