package com.cavin.material3expressivedemo.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.cavin.material3expressivedemo.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    onNavigateToExample: (Routes) -> Unit,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Material 3 Expressive")
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
        Column(
            modifier = Modifier.padding(it)
        ) {
            ListTile(
                title = "App Bar Row",
                onClick = { onNavigateToExample(Routes.AppBarRowExampleRoute) }
            )
        }
    }
}


@Composable
fun ListTile(title: String, onClick: () -> Unit) {
    ListItem(
        headlineContent = { Text(title) },
        modifier = Modifier.clickable(onClick = onClick)
    )
}