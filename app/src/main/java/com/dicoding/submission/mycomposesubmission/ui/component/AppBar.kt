package com.riyandifirman.cinemawiki.component

import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.dicoding.submission.mycomposesubmission.R


@Composable
fun AppBar(navController: NavController) {
    TopAppBar(
        title = {
            Text(
                text = "AseanApp",
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.white)
            )
        },
        actions = {
            IconButton(onClick = { navController.navigate("about") }) {
                Icon(
                    painter = painterResource(R.drawable.ic_about),
                    contentDescription = "about_page",
                    tint = MaterialTheme.colors.onPrimary,
                    modifier = Modifier.size(30.dp)
                )
            }
        },
        backgroundColor = colorResource(id = R.color.purple_700)
    )
}

@Preview(showBackground = true)
@Composable
fun MyAppBarPreview(){
    AppBar(navController = rememberNavController())
}

