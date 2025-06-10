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
package com.cavin.material3expressivecatalog.components.progressindicators

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ContainedLoadingIndicator
import androidx.compose.material3.LinearWavyProgressIndicator
import androidx.compose.material3.LoadingIndicator
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@Composable
fun ProgressIndicatorComposables() {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text("Progress Indicator") },
        )
    }) {
        var progress by remember { mutableFloatStateOf(0.1f) }
        val animatedProgress by
            animateFloatAsState(
                targetValue = progress,
                animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec,
            )

        val containedAnimatedProgress by
            animateFloatAsState(
                targetValue = progress,
                animationSpec =
                spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessVeryLow,
                    visibilityThreshold = 1 / 1000f,
                ),
            )

        val thickStrokeWidth = with(LocalDensity.current) { 8.dp.toPx() }
        val thickStroke = remember(thickStrokeWidth) {
            Stroke(width = thickStrokeWidth, cap = StrokeCap.Round)
        }

        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth(),
            ) {
                CircularWavyProgressIndicator(progress = { 0.9f })

                CircularWavyProgressIndicator(
                    progress = { animatedProgress },
                    // Thick size is slightly larger than the
                    // WavyProgressIndicatorDefaults.CircularContainerSize default
                    modifier = Modifier.size(52.dp),
                    stroke = thickStroke,
                    trackStroke = thickStroke,
                )

                ContainedLoadingIndicator()

                ContainedLoadingIndicator(progress = { containedAnimatedProgress })

                LoadingIndicator()
            }
            Spacer(Modifier.requiredHeight(30.dp))

            LinearWavyProgressIndicator()

            Spacer(Modifier.requiredHeight(30.dp))

            Text("Set progress:")

            Slider(
                modifier = Modifier.width(300.dp),
                value = progress,
                valueRange = 0f..1f,
                onValueChange = { progress = it },
            )
        }
    }
}
