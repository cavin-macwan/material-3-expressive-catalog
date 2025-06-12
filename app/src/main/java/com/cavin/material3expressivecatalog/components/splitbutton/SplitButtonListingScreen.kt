/*
 * Designed and developed by Cavin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cavin.material3expressivecatalog.components.splitbutton

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.AdsClick // Changed from Navigation
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
import com.cavin.material3expressivecatalog.navigation.SplitButtonRoutes
import com.cavin.material3expressivecatalog.ui.composables.ListTile

@Composable
fun SplitButtonListingScreen(
    onNavigateBack: () -> Unit,
    onNavigateToExample: (SplitButtonRoutes) -> Unit,
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Split Button") },
            navigationIcon = {
                IconButton(onClick = onNavigateBack) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Back",
                    )
                }
            },
        )
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
        ) {
            Spacer(Modifier.height(16.dp))
            Icon(
                imageVector = Icons.Filled.AdsClick,
                contentDescription = "Split Button",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally),
                tint = MaterialTheme.colorScheme.primary,
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Split Button",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(8.dp))
            Text(
                // Changed description
                text = "A Split Button combines a primary action button with an attached " +
                    "dropdown menu for a set of secondary, related actions.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(24.dp))

            Text(text = "Examples", style = MaterialTheme.typography.titleMedium)

            Spacer(Modifier.height(8.dp))

            ListTile(
                onClick = {
                    onNavigateToExample(SplitButtonRoutes.Variant1Route)
                },
                title = "Split Button - Variant 1",
                description = "Example of a standard Split Button",
            )

            ListTile(
                onClick = {
                    onNavigateToExample(SplitButtonRoutes.Variant2Route)
                },
                title = "Split Button - Variant 2",
                description = "Another example of a Split Button, showcasing different " +
                    "configurations or styles.",
            )

            ListTile(
                onClick = {
                    onNavigateToExample(SplitButtonRoutes.Variant3Route)
                },
                title = "Split Button - Variant 3",
                description = "Another example of a Split Button, showcasing different " +
                    "configurations or styles.",
            )

            Spacer(Modifier.height(16.dp))
        }
    }
}
