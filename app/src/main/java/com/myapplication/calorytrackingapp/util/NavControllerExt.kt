package com.myapplication.calorytrackingapp.util
import androidx.navigation.NavController
import com.myapplication.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}