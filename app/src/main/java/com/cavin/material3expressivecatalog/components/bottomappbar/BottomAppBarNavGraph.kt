package com.cavin.material3expressivecatalog.components.bottomappbar

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.BottomApBarRoutes
import com.cavin.material3expressivecatalog.ui.screens.ContentScreen

fun EntryProviderBuilder<NavKey>.bottomAppBarNavGraph(backStack: NavBackStack) {
    entry<BottomApBarRoutes.ListingRoute> {
        BottomAppBarListingScreen(
            onNavigateToExample = { backStack.add(it) },
            onNavigateBack = { backStack.removeLastOrNull() }
        )
    }

    entry<BottomApBarRoutes.Variant1Route> {
        ContentScreen {
            BottomAppBarVariant1()
        }
    }

    entry<BottomApBarRoutes.Variant2Route> {
        BottomAppBarVariant2()
    }

    entry<BottomApBarRoutes.Variant3Route> {
        BottomAppBarVariant3()
    }

    entry<BottomApBarRoutes.Variant4Route> {
        BottomAppBarVariant4()
    }


}
