package com.eb.culturereviews.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.eb.culturereviews.ui.theme.GreenColor
import com.eb.culturereviews.view.bottombar.BottomBar
import com.eb.culturereviews.view.navigation.NavGraph

@Composable
fun MainScreen(){
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navController) }
    ) { paddingValues ->
        Surface(modifier = Modifier.fillMaxSize(), color = GreenColor) {

        }
        Box(modifier = Modifier.padding(paddingValues)) {
            NavGraph(navController = navController)
        }
    }
}