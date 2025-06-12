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
package com.cavin.material3expressivecatalog.components.splitbutton

import androidx.navigation3.runtime.EntryProviderBuilder
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import com.cavin.material3expressivecatalog.navigation.SplitButtonRoutes

fun EntryProviderBuilder<NavKey>.splitButtonNavGraph(backStack: NavBackStack) {
    entry<SplitButtonRoutes.ListingRoute> {
        SplitButtonListingScreen(
            onNavigateToExample = { route ->
                backStack.add(route)
            },
            onNavigateBack = { backStack.removeLastOrNull() },
        )
    }

    entry<SplitButtonRoutes.Variant1Route> {
        SplitButtonVariant1()
    }

    entry<SplitButtonRoutes.Variant2Route> {
        SplitButtonVariant2()
    }

    entry<SplitButtonRoutes.Variant3Route> {
        SplitButtonVariant3()
    }
}
