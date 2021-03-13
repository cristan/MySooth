package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun LogIn() {
    Surface(
        color = MaterialTheme.colors.background,
    ) {
        Image(
            painter = painterResource(R.drawable.login),
            contentDescription = null,
            modifier = Modifier.fillMaxHeight().fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "LOG IN",
                fontFamily = FontFamily(Font(R.font.kulim_park_light)),
                fontSize = 28.sp,
                letterSpacing = 1.25.sp
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LogInLightPreview() {
    MyTheme {
        LogIn()
    }
}

@Preview(widthDp = 360, heightDp = 640)
@Composable
fun LogInDarkPreview() {
    MyTheme(darkTheme = true) {
        LogIn()
    }
}