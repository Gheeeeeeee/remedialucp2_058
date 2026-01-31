package com.example.remedialucp2_058.repository

import android.content.Context
import com.example.remedialucp2_058.room.AppDatabase

class ContainerApp(context: Context) {

    private val database = AppDatabase.getDatabase(context)

    private val bukuRepository = BukuRepository(database.bukuDao())
    private val kategoriRepository = KategoriRepository(database.kategoriDao())

    fun bukuRepository(): BukuRepository = bukuRepository
    fun kategoriRepository(): KategoriRepository = kategoriRepository
}
