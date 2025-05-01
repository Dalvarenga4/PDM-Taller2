package com.pdmtaller2.a00027222_diegoalvarenga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pdmtaller2.a00027222_diegoalvarenga.ui.navigation.AppNavigation
import com.pdmtaller2.a00027222_diegoalvarenga.ui.navigation.BottomNavBar
import com.pdmtaller2.a00027222_diegoalvarenga.ui.theme.FoodSpotTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodSpotTheme {
                val navController = rememberNavController()
                val backStackEntry by navController.currentBackStackEntryAsState()
                val current = backStackEntry?.destination?.route ?: "home"

                Scaffold(
                    bottomBar = {
                        if (!current.startsWith("menu")) {
                            BottomNavBar(navController)
                        }
                    }
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        AppNavigation(navController)
                    }
                }
            }
        }
    }
}
