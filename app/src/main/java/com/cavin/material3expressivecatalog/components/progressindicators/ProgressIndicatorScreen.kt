package com.cavin.material3expressivecatalog.components.progressindicators

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PhoneIphone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cavin.material3expressivecatalog.navigation.ProgressIndicatorRoutes
import com.cavin.material3expressivecatalog.ui.composables.ListTile


@Composable
fun ProgressIndicatorListingScreen(
    onNavigateToExample: (ProgressIndicatorRoutes) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Button Group") }
            )
        }) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp)
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
                    onNavigateToExample(ProgressIndicatorRoutes.ProgressIndicatorRoute)
                },
                title = "Progress Indicator",
                description = "Example of various progress indicators"
            )

            ListTile(
                onClick = {
                    onNavigateToExample(ProgressIndicatorRoutes.RefreshIndicatorRoute)
                },
                title = "Refresh Indicator Example",
                description = "Example of Pull to Refresh"
            )
        }
    }
}