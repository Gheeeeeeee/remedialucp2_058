package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.KategoriRepository
import com.example.remedialucp2_058.room.Kategori
import kotlinx.coroutines.launch

class KategoriEditViewModel(
    private val repository: KategoriRepository
) : ViewModel() {

    fun update(kategori: Kategori) {
        viewModelScope.launch {
            repository.update(kategori)
        }
    }
}
