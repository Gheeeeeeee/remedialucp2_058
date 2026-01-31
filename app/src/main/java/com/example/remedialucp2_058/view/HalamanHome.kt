package com.example.remedialucp2_058.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.remedialucp2_058.view.route.DestinasiBuku
import com.example.remedialucp2_058.view.route.DestinasiTambahBuku

@Composable
fun HalamanHome(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate(DestinasiBuku.route) }
        ) {
            Text("Data Buku")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate(DestinasiTambahBuku.route) }
        ) {
            Text("Tambah Buku")
        }
    }
}
