package com.meticha.jetpackboilerplate.details

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class DetailScreenViewModel @Inject constructor() : ViewModel() {
    init {
        println("init started of details")
    }

    override fun onCleared() {
        println("init cleared of details")
        super.onCleared()
    }

}