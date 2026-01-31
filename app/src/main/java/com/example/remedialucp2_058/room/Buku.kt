package com.example.remedialucp2_058.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "buku")
data class Buku(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val judul: String,
    val pengarang: String,
    val status: String,
    val kategoriId: Int?
)
