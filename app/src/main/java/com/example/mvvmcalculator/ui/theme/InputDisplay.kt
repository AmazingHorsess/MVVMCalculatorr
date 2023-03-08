package com.example.mvvmcalculator.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.mvvmcalculator.CalcViewModel
import com.example.mvvmcalculator.theme.spacing


@Composable
internal fun InputDisplayComponent(state: CalcViewModel.ViewState) {
    Box(
        Modifier
            .fillMaxWidth()
            .shadow(
                color = ResultShadowColorTop,
                blurRadius = 15.dp,
                offsetX = (-6).dp,
                offsetY = (-6).dp,
            )
            .shadow(
                color = ResultShadowColorBottom,
                blurRadius = 15.dp,
                offsetX = (6).dp,
                offsetY = (6).dp,
            )
            .clip(MaterialTheme.shapes.large)
            .background(MaterialTheme.colors.onBackground)
            .padding(
                vertical = MaterialTheme.spacing.md,
                horizontal = MaterialTheme.spacing.sm
            )
    ) {
        Text(
            text = state.result,
            overflow = TextOverflow.Visible,
            maxLines = 1,
            style = MaterialTheme.typography.h1.merge(TextStyle(textAlign = TextAlign.End)),
            modifier = Modifier.fillMaxWidth()
        )
    }
}



