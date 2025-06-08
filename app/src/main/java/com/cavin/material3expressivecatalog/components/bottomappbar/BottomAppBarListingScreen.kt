package com.cavin.material3expressivecatalog.components.bottomappbar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.PhoneIphone
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cavin.material3expressivecatalog.navigation.BottomApBarRoutes
import com.cavin.material3expressivecatalog.ui.composables.ListTile

@Composable
fun BottomAppBarListingScreen(
    onNavigateToExample: (BottomApBarRoutes) -> Unit,
    onNavigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Bottom AppBar") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Icon(
                imageVector = Icons.Filled.PhoneIphone,
                contentDescription = "Back",
                modifier = Modifier.size(100.dp)
            )

            Spacer(Modifier.height(16.dp))

            Text(text = "Examples")

            Spacer(Modifier.height(8.dp))

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant1Route)
                },
                title = "Variant 1",
                description = ""
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant2Route)
                },
                title = "Variant 2",
                description = ""
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant3Route)
                },
                title = "Variant 3",
                description = ""
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant4Route)
                },
                title = "Variant 4",
                description = ""
            )
        }
    }
}