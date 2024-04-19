package com.vic.mvvmarchitecture.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vic.mvvmarchitecture.ui.theme.screens.about.Aboutscreen
import com.vic.mvvmarchitecture.ui.theme.screens.home.HomeScreen
import com.vic.mvvmarchitecture.ui.theme.screens.login.LoginScreen
import com.vic.mvvmarchitecture.ui.theme.screens.register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_REGISTER) {
    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) { HomeScreen(navController) }
        composable(ROUTE_ABOUT) { Aboutscreen(navController)}
        composable(ROUTE_REGISTER) { RegisterScreen(navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
    }
}
