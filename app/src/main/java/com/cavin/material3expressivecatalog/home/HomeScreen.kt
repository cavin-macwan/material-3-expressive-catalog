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
package com.cavin.material3expressivecatalog.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuOpen
import androidx.compose.material.icons.automirrored.filled.Segment
import androidx.compose.material.icons.automirrored.filled.Subject // Added
import androidx.compose.material.icons.filled.AddCircleOutline
import androidx.compose.material.icons.filled.CallToAction
import androidx.compose.material.icons.filled.Loop
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Navigation
import androidx.compose.material.icons.filled.TouchApp
import androidx.compose.material.icons.filled.Tune // Added
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.cavin.material3expressivecatalog.ui.composables.GridTile

@Composable
fun HomeScreen(
    onNavigateToButtonGroup: () -> Unit,
    onNavigateToProgressIndicator: () -> Unit,
    onNavigateToButtonRoute: () -> Unit,
    onNavigateToBottomAppBarRoute: () -> Unit,
    onNavigateToFabMenuRoute: () -> Unit,
    onNavigateToFloatingToolBarRoute: () -> Unit,
    onNavigateToLargeFabRoute: () -> Unit,
    onNavigateToNavigationRailRoute: () -> Unit,
    onNavigateToSplitButtonRoute: () -> Unit,
    onNavigateToVerticalFloatingToolbarRoute: () -> Unit,
) {
    val homeItems = listOf(
        HomeItemData(
            title = "Button Group Example",
            icon = Icons.AutoMirrored.Filled.Segment,
            onClickAction = onNavigateToButtonGroup,
        ),
        HomeItemData(
            title = "Progress Indicator Example",
            icon = Icons.Filled.Loop,
            onClickAction = onNavigateToProgressIndicator,
        ),
        HomeItemData(
            title = "Button Example",
            icon = Icons.Filled.TouchApp,
            onClickAction = onNavigateToButtonRoute,
        ),
        HomeItemData(
            title = "Bottom App Bar Example",
            icon = Icons.Filled.CallToAction,
            onClickAction = onNavigateToBottomAppBarRoute,
        ),
        HomeItemData(
            title = "Fab Menu Example",
            icon = Icons.AutoMirrored.Filled.MenuOpen,
            onClickAction = onNavigateToFabMenuRoute,
        ),
        HomeItemData(
            title = "Floating ToolBar Example",
            icon = Icons.AutoMirrored.Filled.Subject,
            onClickAction = onNavigateToFloatingToolBarRoute,
        ),
        HomeItemData(
            title = "Large Floating Action Button Example",
            icon = Icons.Filled.AddCircleOutline,
            onClickAction = onNavigateToLargeFabRoute,
        ),
        HomeItemData(
            title = "Navigation Rail Example",
            icon = Icons.Filled.Navigation,
            onClickAction = onNavigateToNavigationRailRoute,
        ),
        HomeItemData(
            title = "Split Button Example",
            icon = Icons.Filled.MoreVert,
            onClickAction = onNavigateToSplitButtonRoute,
        ),
        HomeItemData(
            title = "Vertical Floating ToolBar",
            icon = Icons.Filled.Tune,
            onClickAction = onNavigateToVerticalFloatingToolbarRoute,
        ),
    )

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Material 3 Expressive Demo") })
        },
    ) { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 24.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            items(homeItems) { homeItem ->
                GridTile(
                    title = homeItem.title,
                    icon = homeItem.icon,
                    onClick = { homeItem.onClickAction() },
                )
            }
        }
    }
}
