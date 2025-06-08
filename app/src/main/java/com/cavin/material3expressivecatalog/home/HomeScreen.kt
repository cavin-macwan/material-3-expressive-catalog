package com.cavin.material3expressivecatalog.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
// import androidx.compose.material3.ListItem // This import seems unused now
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.cavin.material3expressivecatalog.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToExample: (Routes) -> Unit,
) {
    val homeItems = listOf(
        HomeItem(
            title = "App Bar Row",
            route = Routes.AppBarRowExampleRoute
        ),
        HomeItem(
            title = "Button Group Example",
            route = Routes.ButtonGroupRoute
        )
    )
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Material 3 Expressive Demo")
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
            )
        }
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(it)
        ) {
            items(homeItems.size) { item ->
                ListTile(title = homeItems[item].title) {
                    onNavigateToExample(homeItems[item].route)
                }
            }
        }
    }
}


@Composable
fun ListTile(
    modifier: Modifier = Modifier,
    title: String,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier.clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = title, color = Color.Black)
        }
    }
}