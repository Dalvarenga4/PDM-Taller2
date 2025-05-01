package com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.a00027222_diegoalvarenga.data.DummyData
import com.pdmtaller2.a00027222_diegoalvarenga.ui.components.CategoryRow


@Composable
fun HomeScreen(navController: NavController) {
    val restaurants = DummyData.getRestaurants()
    val categories = restaurants.flatMap { it.categories }.distinct()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "FoodSpot",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        categories.forEach { category ->
            val filtered = restaurants.filter { it.categories.contains(category) }

            Text(
                text = category,
                style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            CategoryRow(restaurants = filtered, navController = navController)


            Spacer(modifier = Modifier.height(24.dp))
        }

        Spacer(modifier = Modifier.height(16.dp))
    }
}