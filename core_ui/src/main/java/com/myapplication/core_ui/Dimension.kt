package com.myapplication.core_ui

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimension(

    val default: Dp= 0.dp,
    val spaceExtrasmall: Dp= 0.dp,
    val spaceSmall: Dp=8.dp,
    val spaceMeduim: Dp=16.dp,
    val spaceLarge: Dp=32.dp,
    val spaceExtraLarge: Dp=64.dp
)

val LocalSpace= compositionLocalOf { Dimension() }
