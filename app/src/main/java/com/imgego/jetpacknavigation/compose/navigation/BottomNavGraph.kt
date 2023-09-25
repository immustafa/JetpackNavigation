package com.imgego.jetpacknavigation.compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.imgego.jetpacknavigation.compose.screens.HomeScreen
import com.imgego.jetpacknavigation.compose.screens.ProfileScreen

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomNavScreen.Home.route
    ) {
        composable(route = BottomNavScreen.Home.route) {
            HomeScreen()
        }

        composable(route = BottomNavScreen.Profile.route) {
            ProfileScreen()
        }
    }
}