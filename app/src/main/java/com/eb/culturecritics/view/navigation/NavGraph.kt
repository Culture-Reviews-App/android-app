package com.eb.culturecritics.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eb.culturecritics.view.home.HomeScreen
import com.eb.culturecritics.view.login.LoginScreen

//@Composable
//fun NavGraph(
//    navController: NavHostController,
//    startDestination: String = "login" // Başlangıç ekranı LoginScreen olacak
//) {
//    NavHost(navController = navController, startDestination = startDestination) {
//        composable("login") {
//            LoginScreen(
//                navController = navController,
//            )
//        }
//
//        composable("home") {
//            HomeScreen()
//        }
//    }
//}