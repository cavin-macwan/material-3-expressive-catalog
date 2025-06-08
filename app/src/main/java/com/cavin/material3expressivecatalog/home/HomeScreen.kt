package com.cavin.material3expressivecatalog.home

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items // Added import
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cavin.material3expressivecatalog.ui.composables.GridTile


@Composable
fun HomeScreen(
    onNavigateToButtonGroup: () -> Unit,
    onNavigateToProgressIndicator: () -> Unit,
) {
    // Updated list to use HomeItemData and include onClick actions
    val homeItems = listOf(
        HomeItemData(
            title = "Button Group Example",
            onClickAction = onNavigateToButtonGroup
        ),
        HomeItemData(
            title = "Progress Indicator Example",
            onClickAction = onNavigateToProgressIndicator
        ),
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Material 3 Expressive Demo")
                },
                navigationIcon = {
                    IconButton(onClick = { /* TODO: Implement back navigation */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
            )
        }
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(paddingValues)
        ) {
            items(homeItems) { homeItem ->
                GridTile(title = homeItem.title) {
                    homeItem.onClickAction()
                }
            }
        }
    }
}
