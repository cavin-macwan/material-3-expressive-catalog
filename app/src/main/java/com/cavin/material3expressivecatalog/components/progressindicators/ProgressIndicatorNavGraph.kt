package com.cavin.material3expressivecatalog.components.progressindicators

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.ProgressIndicatorRoutes

fun EntryProviderBuilder<NavKey>.progressIndicatorNavGraph(backStack: NavBackStack) {

    entry<ProgressIndicatorRoutes.ListingRoute> {
        ProgressIndicatorListingScreen(
            onNavigateToExample = { route ->
                backStack.add(route)
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
