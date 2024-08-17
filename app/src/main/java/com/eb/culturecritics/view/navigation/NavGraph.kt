package com.eb.culturecritics.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eb.culturecritics.view.addnew.AddNewScreen
import com.eb.culturecritics.view.bottombar.BottomBarScreen
import com.eb.culturecritics.view.home.HomeScreen
import com.eb.culturecritics.view.profile.ProfileScreen

@Composable
fun NavGraph(
    navController: NavHostController,
    startDestination: String = BottomBarScreen.Home.route
) {
    NavHost(navController = navController, startDestination = startDestination) {
        composable(BottomBarScreen.Home.route) {
            HomeScreen(
//                navController = navController,
            )
        }
        composable(BottomBarScreen.AddNew.route) {
            AddNewScreen(
//                navController = navController,
            )
        }
        composable(BottomBarScreen.Profile.route) {
            ProfileScreen(
//                navController = navController
            )
        }
//        composable("rocket_detail/{rocketId}") { backStackEntry ->
//            val rocketId = backStackEntry.arguments?.getString("rocketId") ?: return@composable
//            RocketDetailScreen(
//                rocketId = rocketId,
//                onBackClick = { navController.popBackStack() }
//            )
//        }
    }
}