package com.cavin.material3expressivecatalog.components.buttongroup

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.ButtonGroupRoutes
import com.cavin.material3expressivecatalog.ui.screens.ContentScreen

/**
 * Defines the navigation graph for the Button Group feature.
 */
fun EntryProviderBuilder<NavKey>.groupButtonNavGraph(backStack: NavBackStack) {
    entry<ButtonGroupRoutes.ListingRoute> {
        ButtonGroupListingScreen(
            onNavigateToExample = { route ->
                backStack.add(route)
            },
            onNavigateBack = { backStack.removeLastOrNull() }
        )
    }

    entry<ButtonGroupRoutes.ButtonGroupRoute> {
        ContentScreen {
            ButtonGroupComposable()
        }
    }

    entry<ButtonGroupRoutes.ConnectedButtonGroupRoute> {
        ContentScreen {
            ConnectedButtonGroupComposable()
        }
    }
}
