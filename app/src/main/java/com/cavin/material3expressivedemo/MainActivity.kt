@file:OptIn(ExperimentalMaterial3ExpressiveApi::class)

package com.cavin.material3expressivedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import com.cavin.material3expressivedemo.navigation.AppNavigation
import com.cavin.material3expressivedemo.ui.theme.CallBudyTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CallBudyTheme {
                AppNavigation()
            }
        }
    }
}
