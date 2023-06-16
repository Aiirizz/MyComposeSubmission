package com.dicoding.submission.mycomposesubmission.ui

import DetailPage
import Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dicoding.submission.mycomposesubmission.ui.about.AboutPage
import com.dicoding.submission.mycomposesubmission.ui.home.HomeViewModel

@Preview
@Composable
fun AseanApp() {
    val navController = rememberNavController()
    val viewModel = HomeViewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            Home(navController = navController, viewModel = viewModel)
        }
        composable("detail/{country.flag}", arguments = listOf(navArgument("country.flag") { type = NavType.IntType }) ) { backStackEntry ->
            val countryKey = backStackEntry.arguments?.getInt("country.flag")
            val country = viewModel.countryList.value.find { it.flag == countryKey }
            if (country != null) {
                DetailPage(country = country)
            }
        }
        composable("about"){
            AboutPage()
        }
    }
}