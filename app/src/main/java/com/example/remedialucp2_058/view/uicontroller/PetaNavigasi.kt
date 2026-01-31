package com.example.remedialucp2_058.view.uicontroller

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.remedialucp2_058.repository.ContainerApp
import com.example.remedialucp2_058.viewmodel.*
import com.example.remedialucp2_058.view.*
import com.example.remedialucp2_058.view.route.*

@Composable
fun PetaNavigasi(container: ContainerApp) {
    val navController = rememberNavController()
    val factory = ViewModelFactory(container)

    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route
    ) {

        composable(DestinasiHome.route) {
            HalamanHome(navController)
        }

        composable(DestinasiBuku.route) {
            val vm: BukuViewModel = viewModel(factory = factory)
            HalamanBuku(navController, vm)
        }

        composable(DestinasiTambahBuku.route) {
            val vm: BukuEntryViewModel = viewModel(factory = factory)
            HalamanTambahBuku(navController, vm)
        }
    }
}