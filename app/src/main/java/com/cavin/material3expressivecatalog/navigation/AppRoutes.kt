/*
 * Designed and developed by Cavin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cavin.material3expressivecatalog.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Routes {
    @Serializable
    data object HomeRoute : NavKey, Routes
}

sealed interface ButtonGroupRoutes :
    Routes,
    NavKey {
    @Serializable
    data object ListingRoute : NavKey, ButtonGroupRoutes

    @Serializable
    data object ButtonGroupRoute : NavKey, ButtonGroupRoutes

    @Serializable
    data object ConnectedButtonGroupRoute : NavKey, ButtonGroupRoutes
}

sealed interface ProgressIndicatorRoutes :
    Routes,
    NavKey {
    @Serializable
    data object ProgressIndicatorRoute : NavKey, ProgressIndicatorRoutes

    @Serializable
    data object RefreshIndicatorRoute : NavKey, ProgressIndicatorRoutes

    @Serializable
    data object ListingRoute : NavKey, ProgressIndicatorRoutes
}

sealed interface ButtonRoutes :
    Routes,
    NavKey {
    @Serializable
    data object ButtonRoute : NavKey, ButtonRoutes
}

sealed interface FabMenuRoutes :
    Routes,
    NavKey {
    @Serializable
    data object FabMenuRoute : NavKey, FabMenuRoutes
}

sealed interface BottomApBarRoutes :
    Routes,
    NavKey {
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

sealed interface FloatingToolBarRoutes :
    Routes,
    NavKey {
    @Serializable
    data object ListingRoute : NavKey, FloatingToolBarRoutes

    @Serializable
    data object Variant1Route : NavKey, FloatingToolBarRoutes

    @Serializable
    data object Variant2Route : NavKey, FloatingToolBarRoutes
}
