package com.pdmtaller2.a00027222_diegoalvarenga.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.home.HomeScreen
import com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.menu.MenuScreen
import com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.orders.OrdersScreen
import com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.search.SearchScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }

        composable("menu") {
            MenuScreen(navController)
        }

        composable("search") {
            SearchScreen(navController)
        }

        composable("orders") {
            OrdersScreen()
        }
    }
}
