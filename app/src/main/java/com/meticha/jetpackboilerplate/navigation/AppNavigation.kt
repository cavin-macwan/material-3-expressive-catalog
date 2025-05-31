package com.meticha.jetpackboilerplate.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import androidx.navigation3.ui.rememberSceneSetupNavEntryDecorator
import com.meticha.jetpackboilerplate.details.DetailsScreen
import com.meticha.jetpackboilerplate.home.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute : NavKey

@Serializable
data object DetailsRoute : NavKey

@Composable
fun AppNavigation() {
    val backStack = rememberNavBackStack(HomeRoute)

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
            entry<HomeRoute> {
                HomeScreen(
                    onNavigateToDetails = {
                        backStack.add(DetailsRoute)
                    }
                )
            }
            entry<DetailsRoute> {
                DetailsScreen()
            }
        }
    )
}