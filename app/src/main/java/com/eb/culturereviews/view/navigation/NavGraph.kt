package com.eb.culturereviews.view.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.eb.culturereviews.view.addnew.AddNewScreen
import com.eb.culturereviews.view.bottombar.BottomBarScreen
import com.eb.culturereviews.view.home.HomeScreen
import com.eb.culturereviews.view.profile.ProfileScreen

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