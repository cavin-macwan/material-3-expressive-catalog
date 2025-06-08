package com.cavin.material3expressivecatalog.components.fab

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.ButtonRoutes
import com.cavin.material3expressivecatalog.navigation.FabMenuRoutes

fun EntryProviderBuilder<NavKey>.fabMenuNavGraph(backStack: NavBackStack) {

    entry<FabMenuRoutes.FabMenuRoute> {
        FabMenuComposable {
            backStack.removeLastOrNull()
        }
    }

}
