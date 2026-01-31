package com.example.remedialucp2_058.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.remedialucp2_058.repository.BukuRepository
import com.example.remedialucp2_058.room.Buku
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class BukuViewModel(
    private val repository: BukuRepository
) : ViewModel() {

    val bukuList: StateFlow<List<Buku>> =
        repository.getAllBuku()
            .stateIn(
                scope = viewModelScope,
                started = SharingStarted.WhileSubscribed(5000),
                initialValue = emptyList()
            )

    fun delete(buku: Buku) {
        viewModelScope.launch {
            repository.delete(buku)
        }
    }
}
