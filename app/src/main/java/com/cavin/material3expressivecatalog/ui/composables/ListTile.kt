package com.cavin.material3expressivecatalog.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForwardIos
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListTile(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    title: String,
    description: String,
) {
    ListItem(
        modifier = modifier.clickable(onClick = onClick),
        headlineContent = { Text(title) },
        supportingContent = { Text(description) },
        trailingContent = {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.ArrowForwardIos,
                contentDescription = "Forward",
            )
        }
    )

}