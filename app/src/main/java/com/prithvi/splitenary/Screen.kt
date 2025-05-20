package com.prithvi.splitenary

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object LoginView: Screen("login_screen")
}
