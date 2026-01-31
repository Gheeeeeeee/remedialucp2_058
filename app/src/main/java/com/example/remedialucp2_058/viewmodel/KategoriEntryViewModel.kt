package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.KategoriRepository
import com.example.remedialucp2_058.room.Kategori
import kotlinx.coroutines.launch

class KategoriEntryViewModel(
    private val repository: KategoriRepository
) : ViewModel() {

    fun insert(namaKategori: String) {
        viewModelScope.launch {
            repository.insert(
                Kategori(namaKategori = namaKategori)
            )
        }
    }
}
