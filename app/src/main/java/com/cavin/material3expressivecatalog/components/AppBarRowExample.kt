package com.cavin.material3expressivecatalog.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Attachment
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Snooze
import androidx.compose.material.icons.outlined.MarkEmailUnread
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.AppBarRow
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.window.core.layout.WindowSizeClass

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarRowExample() {

    val sizeClass = currentWindowAdaptiveInfo().windowSizeClass
// Material guidelines state 3 items max in compact, and 5 items max elsewhere.
// To test this, try a resizable emulator, or a phone in landscape and portrait orientation.
    val maxItemCount =
        if (sizeClass.minWidthDp >= WindowSizeClass.WIDTH_DP_MEDIUM_LOWER_BOUND) {
            5
        } else {
            3
        }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Simple TopAppBar", maxLines = 1, overflow = TextOverflow.Ellipsis)
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    AppBarRow(
                        maxItemCount = maxItemCount,
                        overflowIndicator = {
                            IconButton(onClick = { it.show() }) {
                                Icon(
                                    imageVector = Icons.Filled.MoreVert,
                                    contentDescription = "Localized description"
                                )
                            }
                        }
                    ) {
                        clickableItem(
                            onClick = {},
                            icon = {
                                Icon(
                                    imageVector = Icons.Filled.Attachment,
                                    contentDescription = null
                                )
                            },
                            label = "Attachment"
                        )

                        clickableItem(
                            onClick = {},
                            icon = {
                                Icon(imageVector = Icons.Filled.Edit, contentDescription = null)
                            },
                            label = "Edit"
                        )

                        clickableItem(
                            onClick = {},
                            icon = {
                                Icon(imageVector = Icons.Outlined.Star, contentDescription = null)
                            },
                            label = "Favorite"
                        )

                        clickableItem(
                            onClick = {},
                            icon = {
                                Icon(imageVector = Icons.Filled.Snooze, contentDescription = null)
                            },
                            label = "Alarm"
                        )

                        clickableItem(
                            onClick = {},
                            icon = {
                                Icon(
                                    imageVector = Icons.Outlined.MarkEmailUnread,
                                    contentDescription = "Localized description"
                                )
                            },
                            label = "Email"
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            LazyColumn(
                contentPadding = innerPadding,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                val list = (0..75).map { it.toString() }
                items(count = list.size) {
                    Text(
                        text = list[it],
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    )
                }
            }
        }
    )
}