package com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.search

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import com.pdmtaller2.a00027222_diegoalvarenga.data.DummyData
import com.pdmtaller2.a00027222_diegoalvarenga.ui.components.RestaurantCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    val restaurants = DummyData.getRestaurants()
    var query by remember { mutableStateOf("") }

    val filtered = restaurants.filter { restaurant ->
        val matchesName = restaurant.name.contains(query, ignoreCase = true)
        val matchesCategory = restaurant.categories.any { it.contains(query, ignoreCase = true) }
        val matchesDish = restaurant.menu.any { it.name.contains(query, ignoreCase = true) }

        matchesName || matchesCategory || matchesDish
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Buscar en FoodSpot") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            OutlinedTextField(
                value = query,
                onValueChange = { query = it },
                label = { Text("Buscar por nombre, platillo o categoría") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            if (query.isNotBlank()) {
                Text(
                    text = "Resultados",
                    style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold)
                )

                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxSize().padding(top = 8.dp)
                ) {
                    items(filtered) { restaurant ->
                        RestaurantCard(restaurant) {
                            navController.currentBackStackEntry?.savedStateHandle?.set("restaurant", restaurant)
                            navController.navigate("menu")
                        }
                    }
                }
            }
        }
    }
}
