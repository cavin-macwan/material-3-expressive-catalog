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
package com.cavin.material3expressivecatalog.components.buttongroup

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ButtonGroup
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable

@Composable
fun ButtonGroupComposable() {
    val numButtons = 10
    ButtonGroup(
        overflowIndicator = { menuState ->
            FilledIconButton(
                onClick = {
                    if (menuState.isExpanded) {
                        menuState.dismiss()
                    } else {
                        menuState.show()
                    }
                },
            ) {
                Icon(
                    imageVector = Icons.Filled.MoreVert,
                    contentDescription = "Localized description",
                )
            }
        },
    ) {
        for (i in 0 until numButtons) {
            clickableItem(onClick = {}, label = "$i")
        }
    }
}
