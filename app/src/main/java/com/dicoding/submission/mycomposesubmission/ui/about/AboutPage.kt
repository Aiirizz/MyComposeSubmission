package com.dicoding.submission.mycomposesubmission.ui.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.submission.mycomposesubmission.R

@Composable
fun AboutPage(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = colorResource(id = R.color.teal_200))

    ) {}
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "About Page",
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp),
            modifier = Modifier
                .padding(top = 20.dp, start = 20.dp)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.my_picture),
                contentScale = ContentScale.FillWidth,
                contentDescription = "about-img",
                modifier = Modifier
                    .size(200.dp, 300.dp)
                    .clip(CircleShape)
                    .fillMaxWidth()
                    .border(5.dp, Color.White, CircleShape)
            )
            Text(
                text = "Maulana Ilham Arizqi",
                style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "arizqi165@gmail.com",
                style = TextStyle(fontSize = 16.sp),
                textAlign = TextAlign.Center,
                modifier = Modifier
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutPagePreview(){
    AboutPage()
}