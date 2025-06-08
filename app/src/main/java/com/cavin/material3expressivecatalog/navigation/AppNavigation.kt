package com.cavin.material3expressivecatalog.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.cavin.material3expressivecatalog.home.HomeScreen
import com.cavin.material3expressivecatalog.components.buttongroup.groupButtonNavGraph
import com.cavin.material3expressivecatalog.components.buttons.buttonNavGraph
import com.cavin.material3expressivecatalog.components.progressindicators.progressIndicatorNavGraph


@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(Routes.HomeRoute)

    NavDisplay(
        entryDecorators = listOf(
            // Add the default decorators for managing scenes and saving state
            rememberSceneSetupNavEntryDecorator(),
            rememberSavedStateNavEntryDecorator(),
            // Then add the view model store decorator
            rememberViewModelStoreNavEntryDecorator()
        ),
        backStack = backStack,
        onBack = { backStack.removeLastOrNull() },
        entryProvider = entryProvider {
            entry<Routes.HomeRoute> {
                HomeScreen(
                    onNavigateToButtonGroup = { backStack.add(ButtonGroupRoutes.ButtonGroupListingRoute) },
                    onNavigateToProgressIndicator = { backStack.add(ProgressIndicatorRoutes.ProgressIndicatorListingRoute) },
                    onNavigateToButtonRoute = { backStack.add(ButtonRoutes.ButtonRoute) }
                )
            }

            groupButtonNavGraph(backStack)

            progressIndicatorNavGraph(backStack)

            buttonNavGraph(backStack)
        }
    )
}


