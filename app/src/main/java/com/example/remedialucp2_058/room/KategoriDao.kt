package com.example.remedialucp2_058.room

import androidx.room.*

@Dao
interface KategoriDao {

    @Insert
    suspend fun insert(kategori: Kategori)

    @Update
    suspend fun update(kategori: Kategori)

    @Delete
    suspend fun delete(kategori: Kategori)

    @Query("SELECT * FROM kategori")
    fun getAllKategori(): kotlinx.coroutines.flow.Flow<List<Kategori>>
}
