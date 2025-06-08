package com.cavin.material3expressivecatalog.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.cavin.material3expressivecatalog.components.AppBarRowExample
import com.cavin.material3expressivecatalog.components.buttongroup.ButtonGroupExample
import com.cavin.material3expressivecatalog.home.HomeScreen
import com.cavin.material3expressivecatalog.ui.ContentScreen
import kotlinx.serialization.Serializable

sealed interface Routes {

    @Serializable
    data object HomeRoute : NavKey, Routes

    @Serializable
    data object ButtonGroupRoute : NavKey, Routes

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

                            Routes.ButtonGroupRoute -> {
                                backStack.add(Routes.ButtonGroupRoute)
                            }

                            Routes.HomeRoute -> {}
                        }
                    }
                )
            }
            entry<Routes.AppBarRowExampleRoute> {
                AppBarRowExample()
            }
            entry<Routes.ButtonGroupRoute> {
                ContentScreen {
                    ButtonGroupExample()
                }
            }
        }
    )
}