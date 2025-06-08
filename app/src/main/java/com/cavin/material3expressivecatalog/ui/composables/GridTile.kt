package com.cavin.material3expressivecatalog.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun GridTile(
    modifier: Modifier = Modifier,
    title: String,
    icon: ImageVector,
    onClick: () -> Unit,
) {
    Card(
        modifier = modifier
            .aspectRatio(1f) // Ensures the card is square
            .clickable(onClick = onClick),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize() // Fills the card
                .padding(16.dp), // Padding inside the card
            contentAlignment = Alignment.Center // Centers content within the Box
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally // Centers Icon and Text horizontally
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = title,
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = title)
            }
        }
    }
}
