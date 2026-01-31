package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.BukuRepository
import com.example.remedialucp2_058.room.Buku
import kotlinx.coroutines.launch

class BukuEditViewModel(
    private val repository: BukuRepository
) : ViewModel() {

    fun update(buku: Buku) {
        viewModelScope.launch {
            repository.update(buku)
        }
    }
}
