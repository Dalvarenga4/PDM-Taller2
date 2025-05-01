package com.pdmtaller2.a00027222_diegoalvarenga.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.compose.runtime.getValue

@Composable
fun BottomNavBar(navController: NavController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val current = navBackStackEntry?.destination?.route ?: "home"

    NavigationBar {
        NavigationBarItem(
            selected = current.startsWith("home"),
            onClick = { navController.navigate("home") },
            icon = { Icon(Icons.Default.Home, contentDescription = "Restaurantes") },
            label = { Text("Restaurantes") }
        )
        NavigationBarItem(
            selected = current.startsWith("search"),
            onClick = { navController.navigate("search") },
            icon = { Icon(Icons.Default.Search, contentDescription = "Buscar") },
            label = { Text("Buscar") }
        )
        NavigationBarItem(
            selected = current.startsWith("orders"),
            onClick = { navController.navigate("orders") },
            icon = { Icon(Icons.Default.List, contentDescription = "Órdenes") },
            label = { Text("Órdenes") }
        )
    }
}