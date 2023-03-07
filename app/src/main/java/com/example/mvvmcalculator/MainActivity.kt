package com.example.mvvmcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mvvmcalculator.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MVVMCalculatorTheme {


                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.linearGradient(
                                    colors = listOf(
                                        backroundcolor,
                                        backroundcolor2
                                    )
                                )
                            )

                    ) {

                        Column (verticalArrangement = Arrangement.Bottom,
                            modifier = Modifier
                                .fillMaxSize())
                        {
                            Spacer(modifier = Modifier.padding(80.dp))
                            Row(verticalAlignment = Alignment.Top,
                                horizontalArrangement  =  Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                                Text(text = "941", color = Color.White, fontFamily = sfpro, fontSize = 112.sp)

                            }
                            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                .padding(16.dp, 4.dp)
                                .fillMaxWidth()) {
                                Button(modifier = Modifier

                                    .clip(CircleShape)
                                    .size(80.dp) ,onClick = { /*TODO*/ }) {
                                    Text(text = "AC", color = Color.White, fontFamily = sfpro, fontSize = 34.sp)

                                }
                                Button(modifier = Modifier
                                    .clip(CircleShape)
                                    .size(80.dp) ,onClick = { /*TODO*/ }) {
                                    Icon(painter = painterResource(R.drawable.ic_android_black_24dp), contentDescription = "", tint = Color.White)

                                }
                                Button(modifier = Modifier
                                    .clip(CircleShape)
                                    .size(80.dp) ,onClick = { /*TODO*/ }) {
                                    Icon(painter = painterResource(R.drawable.ic_percent), tint = Color.White, contentDescription ="" )


                                }
                                GradientButtonDivision(


                                    text = "÷",
                                    textColor = Color.White,
                                    gradient = Brush.linearGradient(colors = listOf(orange2, orange)),onClick = { }

                                )

                            }
                            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                .padding(16.dp, 4.dp)
                                .fillMaxWidth()) {

                                GradientButtonNumber(


                                    text = "7",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "8",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "9",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButton(


                                    text = "÷",
                                    textColor = Color.White,
                                    gradient = Brush.linearGradient(colors = listOf(orange2, orange)),onClick = { }

                                )

                            }
                            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                .padding(16.dp, 4.dp)
                                .fillMaxWidth()) {
                                GradientButtonNumber(


                                    text = "4",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "5",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "6",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonMinus(
                                    text = "-",
                                    textColor = Color.White,
                                    gradient = Brush.linearGradient(colors = listOf(orange2, orange)),onClick = { }

                                )

                            }
                            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                .padding(16.dp, 4.dp)
                                .fillMaxWidth()) {
                                GradientButtonNumber(


                                    text = "1",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "2",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = "3",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonPlus(
                                    text = "+",
                                    textColor = Color.White,
                                    gradient = Brush.linearGradient(colors = listOf(orange2, orange)),onClick = { }

                                )



                            }
                            Row(horizontalArrangement = Arrangement.SpaceBetween,modifier = Modifier
                                .padding(16.dp, 8.dp, 16.dp, 70.dp)
                                .fillMaxWidth()) {
                                GradientButtonNumberWide(


                                    text = "0",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )
                                GradientButtonNumber(


                                    text = ",",
                                    textColor = Color.Black,
                                    gradient = Brush.linearGradient(colors = listOf(whitebutton,
                                        whitebutton2)),onClick = { }

                                )

                                GradientButtonEqual(


                                    text = "=",
                                    textColor = Color.White,
                                    gradient = Brush.linearGradient(colors = listOf(orange2, orange)),onClick = { }

                                )

                            }


                        }

                    }

                }


            }
        }
    }

}

