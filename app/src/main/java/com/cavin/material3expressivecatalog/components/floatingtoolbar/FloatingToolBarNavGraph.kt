package com.cavin.material3expressivecatalog.components.floatingtoolbar

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.components.fab.FabMenuComposable
import com.cavin.material3expressivecatalog.navigation.ButtonRoutes
import com.cavin.material3expressivecatalog.navigation.FabMenuRoutes
import com.cavin.material3expressivecatalog.navigation.FloatingToolBarRoutes

fun EntryProviderBuilder<NavKey>.floatingToolBarNavGraph(backStack: NavBackStack) {

    entry<FloatingToolBarRoutes.ListingRoute> {
        FloatingToolBarListingScreen(
            onNavigateBack = { backStack.removeLastOrNull() },
            onNavigateToExample = { backStack.add(it) }
        )
    }

    entry<FloatingToolBarRoutes.Variant1Route> {
        FloatingToolBarVariant1()
    }

    entry<FloatingToolBarRoutes.Variant2Route> {
        FloatingToolBarVariant2()
    }

}
