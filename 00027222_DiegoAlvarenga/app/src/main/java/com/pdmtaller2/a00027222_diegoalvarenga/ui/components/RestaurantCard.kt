package com.pdmtaller2.a00027222_diegoalvarenga.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.pdmtaller2.a00027222_diegoalvarenga.data.Restaurant

@Composable
fun RestaurantCard(restaurant: Restaurant, onClick: () -> Unit) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .width(200.dp)
            .height(160.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        shape = RoundedCornerShape(16.dp)
    ) {
        Column {
            Image(
                painter = rememberAsyncImagePainter(restaurant.imageUrl),
                contentDescription = restaurant.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            )
            Text(
                text = restaurant.name,
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}