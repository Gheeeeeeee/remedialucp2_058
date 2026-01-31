package com.example.remedialucp2_058.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.remedialucp2_058.view.route.DestinasiTambahBuku
import com.example.remedialucp2_058.viewmodel.BukuViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanBuku(
    navController: NavController,
    viewModel: BukuViewModel
) {
    val bukuList by viewModel.bukuList.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Data Buku") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(DestinasiTambahBuku.route) }
            ) {
                Text("+")
            }
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        ) {
            items(bukuList) { buku ->
                Card(
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(text = buku.judul)
                        Text(text = "Pengarang: ${buku.pengarang}")
                        Text(text = "Status: ${buku.status}")

                        Spacer(modifier = Modifier.height(8.dp))

                        Button(
                            onClick = { viewModel.delete(buku) }
                        ) {
                            Text("Hapus")
                        }
                    }
                }
            }
        }
    }
}
