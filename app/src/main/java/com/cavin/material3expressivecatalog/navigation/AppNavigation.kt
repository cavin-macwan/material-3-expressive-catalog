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

import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.cavin.material3expressivecatalog.components.bottomappbar.bottomAppBarNavGraph
import com.cavin.material3expressivecatalog.components.buttongroup.groupButtonNavGraph
import com.cavin.material3expressivecatalog.components.buttons.buttonNavGraph
import com.cavin.material3expressivecatalog.components.fab.fabMenuNavGraph
import com.cavin.material3expressivecatalog.components.floatingtoolbar.floatingToolBarNavGraph
import com.cavin.material3expressivecatalog.components.largefab.largeFabNavGraph
import com.cavin.material3expressivecatalog.components.navigationrail.navigationRailNavGraph
import com.cavin.material3expressivecatalog.components.progressindicators.progressIndicatorNavGraph
import com.cavin.material3expressivecatalog.components.splitbutton.splitButtonNavGraph
import com.cavin.material3expressivecatalog.components.verticalfloatingtoolbar.verticalFloatingToolBarNavGraph
import com.cavin.material3expressivecatalog.components.widenavigationrail.wideNavigationRailNavGraph
import com.cavin.material3expressivecatalog.home.HomeScreen

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Routes.HomeRoute)

    NavDisplay(
        entryDecorators =
            listOf(
                // Add the default decorators for managing scenes and saving state
                rememberSceneSetupNavEntryDecorator(),
                rememberSavedStateNavEntryDecorator(),
                // Then add the view model store decorator
                rememberViewModelStoreNavEntryDecorator(),
            ),
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        transitionSpec = {
            slideInHorizontally(initialOffsetX = { it }) togetherWith
                slideOutHorizontally(targetOffsetX = { -it })
        },
        popTransitionSpec = {
            // Slide in from left when navigating back
            slideInHorizontally(initialOffsetX = { -it }) togetherWith
                slideOutHorizontally(targetOffsetX = { it })
        },
        predictivePopTransitionSpec = {
            // Slide in from left when navigating back
            slideInHorizontally(initialOffsetX = { -it }) togetherWith
                slideOutHorizontally(targetOffsetX = { it })
        },
        entryProvider =
            entryProvider {
                entry<Routes.HomeRoute> {
                    HomeScreen(
                        onNavigateToButtonGroup = { backStack.add(ButtonGroupRoutes.ListingRoute) },
                        onNavigateToProgressIndicator = {
                            backStack.add(
                                ProgressIndicatorRoutes.ListingRoute,
                            )
                        },
                        onNavigateToButtonRoute = { backStack.add(ButtonRoutes.ButtonRoute) },
                        onNavigateToBottomAppBarRoute = {
                            backStack.add(
                                BottomApBarRoutes.ListingRoute,
                            )
                        },
                        onNavigateToFabMenuRoute = { backStack.add(FabMenuRoutes.FabMenuRoute) },
                        onNavigateToFloatingToolBarRoute = {
                            backStack.add(
                                FloatingToolBarRoutes.ListingRoute,
                            )
                        },
                        onNavigateToLargeFabRoute = {
                            backStack.add(
                                LargeFabRoutes.ListingRoute,
                            )
                        },
                        onNavigateToNavigationRailRoute = {
                            backStack.add(
                                NavigationRailRoutes.ListingRoute,
                            )
                        },
                        onNavigateToSplitButtonRoute = {
                            backStack.add(
                                SplitButtonRoutes.ListingRoute,
                            )
                        },
                        onNavigateToVerticalFloatingToolbarRoute = {
                            backStack.add(
                                VerticalFloatingToolBarRoutes.ToolbarRoute,
                            )
                        },
                        onNavigateToWideNavigationRailRoute = {
                            backStack.add(
                                WideNavigationRailRoutes.ToolbarRoute,
                            )
                        },
                    )
                }

                groupButtonNavGraph(backStack)

                progressIndicatorNavGraph(backStack)

                buttonNavGraph(backStack)

                bottomAppBarNavGraph(backStack)

                fabMenuNavGraph(backStack)

                floatingToolBarNavGraph(backStack)

                largeFabNavGraph(backStack)

                navigationRailNavGraph(backStack)

                splitButtonNavGraph(backStack)

                verticalFloatingToolBarNavGraph()

                wideNavigationRailNavGraph()
            },
    )
}
