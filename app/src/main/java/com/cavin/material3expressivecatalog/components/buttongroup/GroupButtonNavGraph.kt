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
    entry<ButtonGroupRoutes.ButtonGroupListingRoute> {
        ButtonGroupListingScreen(
            onNavigateToExample = { route ->
                when (route) {
                    ButtonGroupRoutes.ButtonGroupListingRoute -> {
                        // No-op or handle as needed, maybe log or refresh
                    }
                    ButtonGroupRoutes.ButtonGroupRoute -> {
                        backStack.add(ButtonGroupRoutes.ButtonGroupRoute)
                    }
                    ButtonGroupRoutes.ConnectedButtonGroupRoute -> {
                        backStack.add(ButtonGroupRoutes.ConnectedButtonGroupRoute)
                    }
                }
            }
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
