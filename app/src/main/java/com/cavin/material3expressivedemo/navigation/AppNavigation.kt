package com.cavin.material3expressivedemo.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.cavin.material3expressivedemo.components.AppBarRowExample
import com.cavin.material3expressivedemo.details.DetailsScreen
import com.cavin.material3expressivedemo.home.HomeScreen
import kotlinx.serialization.Serializable

sealed interface Routes {

    @Serializable
    data object HomeRoute : NavKey, Routes

    @Serializable
    data object DetailsRoute : NavKey, Routes

    @Serializable
    data object AppBarRowExampleRoute : NavKey, Routes
}


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
                    onNavigateToExample = { routes ->
                        when (routes) {
                            Routes.AppBarRowExampleRoute -> {
                                backStack.add(Routes.AppBarRowExampleRoute)
                            }

                            Routes.DetailsRoute -> {
                                backStack.add(Routes.DetailsRoute)
                            }

                            Routes.HomeRoute -> {}
                        }
                    }
                )
            }
            entry<Routes.DetailsRoute> {
                DetailsScreen()
            }
            entry<Routes.AppBarRowExampleRoute> {
                AppBarRowExample()
            }
        }
    )
}