package com.cavin.material3expressivecatalog.home

import androidx.compose.ui.graphics.vector.ImageVector

data class HomeItemData(
    val title: String,
    val icon: ImageVector,
    val onClickAction: () -> Unit
)
