package com.example.remedialucp2_058.room

import androidx.room.*

@Dao
interface BukuDao {

    @Insert
    suspend fun insert(buku: Buku)

    @Update
    suspend fun update(buku: Buku)

    @Delete
    suspend fun delete(buku: Buku)

    @Query("SELECT * FROM buku")
    fun getAllBuku(): kotlinx.coroutines.flow.Flow<List<Buku>>
}
