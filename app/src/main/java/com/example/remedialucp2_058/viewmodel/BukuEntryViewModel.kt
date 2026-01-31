package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.BukuRepository
import com.example.remedialucp2_058.room.Buku
import kotlinx.coroutines.launch

class BukuEntryViewModel(
    private val repository: BukuRepository
) : ViewModel() {

    fun insert(
        judul: String,
        pengarang: String,
        status: String,
        kategoriId: Int?
    ) {
        viewModelScope.launch {
            repository.insert(
                Buku(
                    judul = judul,
                    pengarang = pengarang,
                    status = status,
                    kategoriId = kategoriId
                )
            )
        }
    }
}
