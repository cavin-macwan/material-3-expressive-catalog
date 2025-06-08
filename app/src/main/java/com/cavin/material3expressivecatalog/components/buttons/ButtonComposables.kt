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
package com.cavin.material3expressivecatalog.components.buttons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedToggleButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledIconToggleButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.FilledTonalIconToggleButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonComposables() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Buttons") },
        )
    }) { innerPadding ->

        var checked by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 32.dp),
            verticalArrangement = Arrangement.Center,
        ) {
            Text("Elevated Button")
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth(),
            ) {
                ElevatedButton(
                    onClick = {},
                    shapes = ButtonDefaults.shapes(),
                ) { Text("Elevated Button") }

                ElevatedToggleButton(
                    checked = checked,
                    onCheckedChange = { checked = it },
                ) {
                    Text("Elevated Button")
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text("Filled Icon Button")
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth(),
            ) {
                FilledIconButton(
                    onClick = { /* doSomething() */ },
                    shapes = IconButtonDefaults.shapes(),
                ) {
                    Icon(Icons.Filled.Lock, contentDescription = "Localized description")
                }
                FilledIconToggleButton(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    shapes = IconButtonDefaults.toggleableShapes(),
                ) {
                    if (checked) {
                        Icon(Icons.Filled.Lock, contentDescription = "Localized description")
                    } else {
                        Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
                    }
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Text("Tonal Button")
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth(),
            ) {
                FilledTonalButton(onClick = {}, shapes = ButtonDefaults.shapes()) {
                    Text("Filled Tonal Button")
                }

                FilledTonalIconButton(
                    onClick = { /* doSomething() */ },
                    shapes = IconButtonDefaults.shapes(),
                ) {
                    Icon(Icons.Filled.Lock, contentDescription = "Localized description")
                }

                FilledTonalIconToggleButton(
                    checked = checked,
                    onCheckedChange = { checked = it },
                    shapes = IconButtonDefaults.toggleableShapes(),
                ) {
                    if (checked) {
                        Icon(Icons.Filled.Lock, contentDescription = "Localized description")
                    } else {
                        Icon(Icons.Outlined.Lock, contentDescription = "Localized description")
                    }
                }
            }
        }
    }
}
