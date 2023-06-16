package com.dicoding.submission.mycomposesubmission

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.submission.mycomposesubmission.ui.AseanApp
import com.dicoding.submission.mycomposesubmission.ui.theme.MyComposeSubmissionTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeSubmissionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AseanApp()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview(){
    MyComposeSubmissionTheme{
        AseanApp()
    }
}