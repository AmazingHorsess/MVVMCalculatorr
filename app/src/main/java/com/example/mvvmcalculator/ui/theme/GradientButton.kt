package com.example.mvvmcalculator.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmcalculator.R


@Composable
fun GradientButtonDivision(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit

){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(R.drawable.ic_division), tint = Color.White, contentDescription ="" )

        }
    }
}

@Composable
fun GradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,

    onClick: () -> Unit




){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(R.drawable.ic_multiple), tint = Color.White, contentDescription ="" )
        }
    }
}

@Composable
fun GradientButtonMinus(
    text: String,
    textColor: Color,
    gradient: Brush,

    onClick: () -> Unit




){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(R.drawable.ic_minus), tint = Color.White, contentDescription ="" )
        }
    }
}

@Composable
fun GradientButtonPlus(
    text: String,
    textColor: Color,
    gradient: Brush,

    onClick: () -> Unit




){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(R.drawable.ic_plus), tint = Color.White, contentDescription ="" )
        }
    }
}
@Composable
fun GradientButtonEqual(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(painter = painterResource(R.drawable.ic_equal), tint = Color.White, contentDescription ="" )
        }
    }
}
@Composable
fun GradientButtonNumber(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor,fontFamily = sfpro, fontSize = 34.sp)
        }
    }
}
@Preview
@Composable
fun GradientButtonNumberWide(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
){
    Button(
        modifier =  Modifier.clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent
        ),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .width(180.dp)
                .height(80.dp)
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .clip(shape = RoundedCornerShape(50.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor,fontFamily = sfpro, fontSize = 34.sp, textAlign = TextAlign.Left)
        }
    }
}


