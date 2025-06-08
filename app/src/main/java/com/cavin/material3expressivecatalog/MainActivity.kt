package com.cavin.material3expressivecatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cavin.material3expressivecatalog.navigation.AppNavigation
import com.cavin.material3expressivecatalog.ui.theme.Material3ExpressiveCatalogTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Material3ExpressiveCatalogTheme {
                AppNavigation()
            }
        }
    }
}
