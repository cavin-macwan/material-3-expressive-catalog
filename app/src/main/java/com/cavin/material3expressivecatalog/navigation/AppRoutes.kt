package com.cavin.material3expressivecatalog.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Routes {

    @Serializable
    data object HomeRoute : NavKey, Routes

}

sealed interface ButtonGroupRoutes : Routes {
    @Serializable
    data object ButtonGroupListingRoute : NavKey, ButtonGroupRoutes

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
    data object ProgressIndicatorListingRoute : NavKey, ProgressIndicatorRoutes
}













