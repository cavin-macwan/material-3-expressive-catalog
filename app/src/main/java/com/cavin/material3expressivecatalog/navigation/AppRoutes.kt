package com.cavin.material3expressivecatalog.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Routes {

    @Serializable
    data object HomeRoute : NavKey, Routes

}

sealed interface ButtonGroupRoutes : Routes, NavKey {
    @Serializable
    data object ListingRoute : NavKey, ButtonGroupRoutes

    @Serializable
    data object ButtonGroupRoute : NavKey, ButtonGroupRoutes

    @Serializable
    data object ConnectedButtonGroupRoute : NavKey, ButtonGroupRoutes
}

sealed interface ProgressIndicatorRoutes : Routes, NavKey {

    @Serializable
    data object ProgressIndicatorRoute : NavKey, ProgressIndicatorRoutes

    @Serializable
    data object RefreshIndicatorRoute : NavKey, ProgressIndicatorRoutes

    @Serializable
    data object ListingRoute : NavKey, ProgressIndicatorRoutes
}


sealed interface ButtonRoutes : Routes, NavKey {

    @Serializable
    data object ButtonRoute : NavKey, ButtonRoutes

}

sealed interface FabMenuRoutes : Routes, NavKey {

    @Serializable
    data object FabMenuRoute : NavKey, FabMenuRoutes

}

sealed interface BottomApBarRoutes : Routes, NavKey {

    @Serializable
    data object ListingRoute : NavKey, BottomApBarRoutes

    @Serializable
    data object Variant1Route : NavKey, BottomApBarRoutes

    @Serializable
    data object Variant2Route : NavKey, BottomApBarRoutes

    @Serializable
    data object Variant3Route : NavKey, BottomApBarRoutes

    @Serializable
    data object Variant4Route : NavKey, BottomApBarRoutes

}

sealed interface FloatingToolBarRoutes : Routes, NavKey {

    @Serializable
    data object ListingRoute : NavKey, FloatingToolBarRoutes

    @Serializable
    data object Variant1Route : NavKey, FloatingToolBarRoutes

    @Serializable
    data object Variant2Route : NavKey, FloatingToolBarRoutes


}













