package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.KategoriRepository
import com.example.remedialucp2_058.room.Kategori
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class KategoriViewModel(
    private val repository: KategoriRepository
) : ViewModel() {

    val kategoriList: StateFlow<List<Kategori>> =
        repository.getAllKategori()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )

    fun delete(kategori: Kategori) {
        viewModelScope.launch {
            repository.delete(kategori)
        }
    }
}
