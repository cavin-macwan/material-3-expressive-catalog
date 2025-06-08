package com.cavin.material3expressivecatalog.components.bottomappbar

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.AppBarRow
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FlexibleBottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun BottomAppBarVariant1() {
    FlexibleBottomAppBar(
        contentPadding = PaddingValues(horizontal = 96.dp),
        horizontalArrangement = BottomAppBarDefaults.FlexibleFixedHorizontalArrangement,
    ) {
        AppBarRow(
            overflowIndicator = { menuState ->
                IconButton(
                    onClick = {
                        if (menuState.isExpanded) {
                            menuState.dismiss()
                        } else {
                            menuState.show()
                        }
                    }
                ) {
                    Icon(
                        imageVector = Icons.Filled.MoreVert,
                        contentDescription = "Localized description"
                    )
                }
            }
        ) {
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Localized description"
                    )
                },
                label = "ArrowBack"
            )
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = {
                    Icon(
                        Icons.AutoMirrored.Filled.ArrowForward,
                        contentDescription = "Localized description"
                    )
                },
                label = "ArrowForward"
            )
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = { Icon(Icons.Filled.Add, contentDescription = "Localized description") },
                label = "Add"
            )
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = { Icon(Icons.Filled.Check, contentDescription = "Localized description") },
                label = "Check"
            )
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = { Icon(Icons.Filled.Edit, contentDescription = "Localized description") },
                label = "Edit"
            )
            clickableItem(
                onClick = { /* doSomething() */ },
                icon = {
                    Icon(Icons.Filled.Favorite, contentDescription = "Localized description")
                },
                label = "Favorite"
            )
        }
    }
}