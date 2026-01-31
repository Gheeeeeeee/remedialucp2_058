package com.example.remedialucp2_058.repository

import com.example.remedialucp2_058.room.Kategori
import com.example.remedialucp2_058.room.KategoriDao
import kotlinx.coroutines.flow.Flow

class KategoriRepository(
    private val kategoriDao: KategoriDao
) {

    fun getAllKategori(): Flow<List<Kategori>> {
        return kategoriDao.getAllKategori()
    }

    suspend fun insert(kategori: Kategori) {
        kategoriDao.insert(kategori)
    }

    suspend fun update(kategori: Kategori) {
        kategoriDao.update(kategori)
    }

    suspend fun delete(kategori: Kategori) {
        kategoriDao.delete(kategori)
    }
}
