package com.meticha.jetpackboilerplate.home

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    init {
        println("init started of home")
    }

    override fun onCleared() {
        println("init cleared of home")
        super.onCleared()
    }
}