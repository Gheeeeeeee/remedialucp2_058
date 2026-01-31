package com.example.remedialucp2_058

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.remedialucp2_058.repository.ContainerApp
import com.example.remedialucp2_058.view.uicontroller.PetaNavigasi
import com.example.remedialucp2_058.ui.theme.Remedialucp2_058Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val container = ContainerApp(this)

        setContent {
            Remedialucp2_058Theme {
                PetaNavigasi(container)
            }
        }
    }
}
