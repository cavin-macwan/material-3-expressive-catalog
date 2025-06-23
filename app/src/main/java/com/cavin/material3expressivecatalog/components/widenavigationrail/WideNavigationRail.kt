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
package com.cavin.material3expressivecatalog.components.widenavigationrail

import android.annotation.SuppressLint
import android.app.Activity
import android.content.pm.ActivityInfo
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuOpen
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.WideNavigationRail
import androidx.compose.material3.WideNavigationRailItem
import androidx.compose.material3.WideNavigationRailValue
import androidx.compose.material3.rememberWideNavigationRailState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.semantics.stateDescription
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@SuppressLint("SourceLockedOrientationActivity")
@Composable
fun WideNavigationRail() {
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home", "Search", "Settings")
    val selectedIcons = listOf(Icons.Filled.Home, Icons.Filled.Favorite, Icons.Filled.Star)
    val unselectedIcons =
        listOf(Icons.Outlined.Home, Icons.Outlined.FavoriteBorder, Icons.Outlined.StarBorder)
    val state = rememberWideNavigationRailState()
    val scope = rememberCoroutineScope()

    Row(Modifier.fillMaxWidth()) {
        WideNavigationRail(
            state = state,
            header = {
                IconButton(
                    modifier =
                    Modifier
                        .padding(start = 24.dp)
                        .semantics {
                            // The button must announce the expanded or collapsed state of the rail
                            // for accessibility.
                            stateDescription =
                                if (state.currentValue == WideNavigationRailValue.Expanded) {
                                    "Expanded"
                                } else {
                                    "Collapsed"
                                }
                        },
                    onClick = {
                        scope.launch {
                            if (state.targetValue == WideNavigationRailValue.Expanded) {
                                state.collapse()
                            } else {
                                state.expand()
                            }
                        }
                    },
                ) {
                    if (state.targetValue == WideNavigationRailValue.Expanded) {
                        Icon(
                            Icons.AutoMirrored.Filled.MenuOpen,
                            "Collapse rail",
                        )
                    } else {
                        Icon(Icons.Filled.Menu, "Expand rail")
                    }
                }
            },
        ) {
            items.forEachIndexed { index, item ->
                WideNavigationRailItem(
                    railExpanded = state.targetValue == WideNavigationRailValue.Expanded,
                    icon = {
                        val imageVector =
                            if (selectedItem == index) {
                                selectedIcons[index]
                            } else {
                                unselectedIcons[index]
                            }
                        Icon(imageVector = imageVector, contentDescription = null)
                    },
                    label = { Text(item) },
                    selected = selectedItem == index,
                    onClick = { selectedItem = index },
                )
            }
        }

        val textString =
            if (state.currentValue == WideNavigationRailValue.Expanded) {
                "Expanded"
            } else {
                "Collapsed"
            }
        Column {
            Text(modifier = Modifier.padding(16.dp), text = "Is animating: " + state.isAnimating)
            Text(modifier = Modifier.padding(16.dp), text = "The rail is $textString.")
            Text(
                modifier = Modifier.padding(16.dp),
                text =
                "Note: The orientation of this demo has been locked to portrait mode, because" +
                    " landscape mode may result in a compact height in certain devices. For" +
                    " any compact screen dimensions, use a Navigation Bar instead.",
            )
        }
    }

// Lock the orientation for this demo as the navigation rail may look cut off in landscape in
// smaller screens.
    val context = LocalContext.current
    DisposableEffect(context) {
        (context as? Activity)?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        onDispose {
            (context as? Activity)?.requestedOrientation =
                ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
        }
    }
}
