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
package com.cavin.material3expressivecatalog.components.largefab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.Subject
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
import com.cavin.material3expressivecatalog.navigation.LargeFabRoutes
import com.cavin.material3expressivecatalog.ui.composables.ListTile

@Composable
fun LargeFabListingScreen(
    onNavigateBack: () -> Unit,
    onNavigateToExample: (LargeFabRoutes) -> Unit,
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Large Floating Action Buttons") },
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
                imageVector = Icons.AutoMirrored.Filled.Subject,
                contentDescription = "Large Fab",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally),
                tint = MaterialTheme.colorScheme.primary,
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "Large Fab",
                style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = "Large Floating Action Buttons (FABs) are used for a primary, or most " +
                    "common, action on a screen. Their large size and prominent placement " +
                    "ensures they are easily discoverable and accessible.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.align(Alignment.CenterHorizontally),
            )
            Spacer(Modifier.height(24.dp))

            Text(text = "Examples", style = MaterialTheme.typography.titleMedium)

            Spacer(Modifier.height(8.dp))

            ListTile(
                onClick = {
                    onNavigateToExample(LargeFabRoutes.Variant1Route)
                },
                title = "Large Extended Floating Action Button Variant 1",
                description = "Example of a standard floating toolbar",
            )

            ListTile(
                onClick = {
                    onNavigateToExample(LargeFabRoutes.Variant2Route)
                },
                title = "Large Extended Floating Action Button Variant 2",
                description = "Example of a floating toolbar that gets dismissed when " +
                    "the user scrolls",
            )
            Spacer(Modifier.height(16.dp))
        }
    }
}
