package com.example.remedialucp2_058.repository

import com.example.remedialucp2_058.room.Buku
import com.example.remedialucp2_058.room.BukuDao
import kotlinx.coroutines.flow.Flow

class BukuRepository(
    private val bukuDao: BukuDao
) {

    fun getAllBuku(): Flow<List<Buku>> {
        return bukuDao.getAllBuku()
    }

    suspend fun insert(buku: Buku) {
        bukuDao.insert(buku)
    }

    suspend fun update(buku: Buku) {
        bukuDao.update(buku)
    }

    suspend fun delete(buku: Buku) {
        bukuDao.delete(buku)
    }
}
