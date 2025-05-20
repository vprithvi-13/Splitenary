package com.prithvi.splitenary

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.prithvi.splitenary.feature.login.LoginView
import com.prithvi.splitenary.feature.splash_screen.SplashScreen

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.SplashScreen.route ){
        composable(route = Screen.SplashScreen.route){
            SplashScreen(navController = navController)
        }
        composable(route = Screen.LoginView.route){
            LoginView(navController = navController)
        }
    }
}