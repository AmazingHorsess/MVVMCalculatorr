package com.example.mvvmcalculator.ui.theme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable


private val DarkColorPalette = darkColors(
    background = OuterSpace300,
    onBackground = OuterSpace200,
)

@Composable
fun CalculatorTheme(content: @Composable () -> Unit) {
    val colors = DarkColorPalette
    val systemUiController = rememberSystemUiController()

    systemUiController.setSystemBarsColor(color = colors.background)
    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}