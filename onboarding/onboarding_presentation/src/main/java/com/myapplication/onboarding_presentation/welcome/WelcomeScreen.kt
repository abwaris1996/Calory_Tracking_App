package com.myapplication.onboarding_presentation.welcome

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.myapplication.core.util.UiEvent
import com.myapplication.core.util.naviagation.Route
import com.myapplication.core_ui.LocalSpace
import components.ActionButton


@Composable
fun WelcomeScreen(

    onNavigate: (UiEvent.Navigate)->Unit
) {
    val spacing = LocalSpace.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(spacing.spaceMeduim),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = core.R.string.welcome_text),
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(spacing.spaceMeduim))
        ActionButton(
            text = stringResource(id = core.R.string.next),
            onClick = { onNavigate(UiEvent.Navigate(Route.AGE)) },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}