package com.pdmtaller2.a00027222_diegoalvarenga.ui.components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.a00027222_diegoalvarenga.data.Restaurant
import com.pdmtaller2.a00027222_diegoalvarenga.ui.screens.home.RestaurantCard
import kotlinx.coroutines.launch
import androidx.compose.ui.Alignment
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color

@Composable
fun CategoryRow(
    restaurants: List<Restaurant>,
    navController: NavController
) {
    val listState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()

    Box {
        LazyRow(
            state = listState,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(restaurants) { restaurant ->
                RestaurantCard(restaurant) {
                    navController.currentBackStackEntry?.savedStateHandle?.set("restaurant", restaurant)
                    navController.navigate("menu")
                }
            }
        }

        // Flecha izquierda
        if (listState.firstVisibleItemIndex > 0) {
            IconButton(
                onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(listState.firstVisibleItemIndex - 1)
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 4.dp)
                    .background(
                        color = Color.LightGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Anterior",
                    tint = Color.Black,
                    modifier = Modifier.padding(6.dp)
                )
            }
        }

        // Flecha derecha
        val showRightArrow = remember {
            derivedStateOf {
                val visibleItems = listState.layoutInfo.visibleItemsInfo
                val lastVisible = visibleItems.lastOrNull()?.index ?: 0
                lastVisible < restaurants.lastIndex
            }
        }

        if (showRightArrow.value) {
            IconButton(
                onClick = {
                    coroutineScope.launch {
                        listState.animateScrollToItem(listState.firstVisibleItemIndex + 1)
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 4.dp)
                    .background(
                        color = Color.LightGray,
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "Siguiente",
                    tint = Color.Black,
                    modifier = Modifier.padding(6.dp)
                )
            }
        }
    }
}
