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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
            Spacer(Modifier.height(16.dp))
            Icon(
                imageVector = Icons.Filled.PhoneIphone,
                contentDescription = "Bottom App Bar",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Bottom App Bar",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Bottom App Bars provide access to navigation and key actions at the bottom of mobile screens. They can optionally include a Floating Action Button.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(24.dp))

            Text(text = "Examples", style = MaterialTheme.typography.titleMedium)

            Spacer(Modifier.height(8.dp))

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant1Route)
                },
                title = "Variant 1",
                description = "Basic Bottom App Bar"
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant2Route)
                },
                title = "Variant 2",
                description = "Bottom App Bar with FAB"
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant3Route)
                },
                title = "Variant 3",
                description = "Bottom App Bar with more actions"
            )

            ListTile(
                onClick = {
                    onNavigateToExample(BottomApBarRoutes.Variant4Route)
                },
                title = "Variant 4",
                description = "Another Bottom App Bar layout"
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}
