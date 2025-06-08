package com.cavin.material3expressivecatalog.components.buttons

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.ButtonRoutes

fun EntryProviderBuilder<NavKey>.buttonNavGraph(backStack: NavBackStack) {

    entry<ButtonRoutes.ButtonRoute> {
        ButtonComposables()
    }

}
