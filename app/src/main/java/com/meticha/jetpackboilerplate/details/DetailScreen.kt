package com.meticha.jetpackboilerplate.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun DetailsScreen(viewModel: DetailScreenViewModel = hiltViewModel()) {
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ) {
            Text("Details Screen")
        }
    }
}
