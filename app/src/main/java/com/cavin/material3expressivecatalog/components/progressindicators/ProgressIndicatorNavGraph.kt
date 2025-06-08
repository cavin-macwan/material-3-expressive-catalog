package com.cavin.material3expressivecatalog.components.progressindicators

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.components.buttongroup.ButtonGroupComposable
import com.cavin.material3expressivecatalog.components.buttongroup.ConnectedButtonGroupComposable
import com.cavin.material3expressivecatalog.navigation.ButtonGroupRoutes
import com.cavin.material3expressivecatalog.navigation.ProgressIndicatorRoutes
import com.cavin.material3expressivecatalog.ui.screens.ContentScreen

fun EntryProviderBuilder<NavKey>.progressIndicatorNavGraph(backStack: NavBackStack) {

    entry<ProgressIndicatorRoutes.ProgressIndicatorListingRoute> {
        ProgressIndicatorListingScreen(
            onNavigateToExample = {
                when (it) {
                    ProgressIndicatorRoutes.ProgressIndicatorRoute -> {
                        backStack.add(ProgressIndicatorRoutes.ProgressIndicatorRoute)
                    }

                    ProgressIndicatorRoutes.RefreshIndicatorRoute -> {
                        backStack.add(ProgressIndicatorRoutes.RefreshIndicatorRoute)
                    }

                    else -> {}
                }
            }
        )
    }

    entry<ProgressIndicatorRoutes.ProgressIndicatorRoute> {
        ProgressIndicatorComposables()
    }

    entry<ProgressIndicatorRoutes.RefreshIndicatorRoute> {
        RefreshIndicatorComposable()
    }
}
