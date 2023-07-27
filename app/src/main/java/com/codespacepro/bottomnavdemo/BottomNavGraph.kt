package com.codespacepro.bottomnavdemo

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.codespacepro.bottomnavdemo.screen.DetailScreen
import com.codespacepro.bottomnavdemo.screen.HomeScreen
import com.codespacepro.bottomnavdemo.screen.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomNavScreen.Home.route) {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomNavScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomNavScreen.Detail.route) {
            DetailScreen()
        }
    }

}