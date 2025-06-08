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
            onNavigateBack = { backStack.removeLastOrNull() },
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
