package com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.orders

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrdersScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Pantalla de órdenes") }
            )
        }
    ) { innerPadding ->
        Text(
            text = "Pantalla de órdenes",
            modifier = Modifier.padding(innerPadding).padding(16.dp),
            style = MaterialTheme.typography.headlineMedium
        )
    }
}