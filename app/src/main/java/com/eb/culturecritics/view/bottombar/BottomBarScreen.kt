package com.eb.culturecritics.view.bottombar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.eb.culturecritics.R

sealed class BottomBarScreen(
    val route: String,
    val title: Int,
    val icon: ImageVector
){
    object Home : BottomBarScreen(
        route = "home",
        title = R.string.home,
        icon = Icons.Default.Home
    )

    object AddNew : BottomBarScreen(
        route = "addNew",
        title = R.string.add_new,
        icon = Icons.Default.AddBox
    )

    object Profile : BottomBarScreen(
        route = "profile",
        title = R.string.profile,
        icon = Icons.Default.Person
    )
}
