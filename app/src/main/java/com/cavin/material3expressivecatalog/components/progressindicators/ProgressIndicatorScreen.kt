package com.cavin.material3expressivecatalog.components.progressindicators

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Refresh
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
import com.cavin.material3expressivecatalog.navigation.ProgressIndicatorRoutes
import com.cavin.material3expressivecatalog.ui.composables.ListTile


@Composable
fun ProgressIndicatorListingScreen(
    onNavigateToExample: (ProgressIndicatorRoutes) -> Unit,
    onNavigateBack: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Progress Indicators") },
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
                imageVector = Icons.Filled.Refresh,
                contentDescription = "Progress Indicators",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally),
                tint = MaterialTheme.colorScheme.primary
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Progress Indicators",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Progress indicators inform users about the status of ongoing processes, such as loading an app, submitting a form, or saving updates.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(24.dp))

            Text(text = "Examples", style = MaterialTheme.typography.titleMedium)

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
            Spacer(Modifier.height(16.dp))
        }
    }
}
