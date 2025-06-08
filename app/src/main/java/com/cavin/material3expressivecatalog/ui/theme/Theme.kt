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
package com.cavin.material3expressivecatalog.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.MaterialExpressiveTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.expressiveLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@ExperimentalMaterial3ExpressiveApi
@Composable
fun Material3ExpressiveCatalogTheme(content: @Composable () -> Unit) {
    val isDarkTheme = isSystemInDarkTheme()

    val colorScheme =
        when {
            isDarkTheme -> {
                dynamicDarkColorScheme(LocalContext.current)
            }

            !isDarkTheme -> {
                dynamicLightColorScheme(LocalContext.current)
            }

            else -> expressiveLightColorScheme()
        }

    MaterialExpressiveTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
    )
}
