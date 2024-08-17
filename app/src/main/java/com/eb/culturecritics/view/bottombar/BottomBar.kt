package com.eb.culturecritics.view.bottombar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.eb.culturecritics.ui.theme.BlackColor
import com.eb.culturecritics.ui.theme.DarkGreenColor
import com.eb.culturecritics.ui.theme.PaleBlackColor
import com.eb.culturecritics.ui.theme.PaleWhiteColor
import com.eb.culturecritics.ui.theme.WhiteColor

@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.AddNew,
        BottomBarScreen.Profile
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Box() {
        NavigationBar(
            containerColor = DarkGreenColor,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            screens.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: BottomBarScreen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    val isSelected = currentDestination?.hierarchy?.any {
        it.route == screen.route
    } == true

    NavigationBarItem(
        label = {
            Text(
                text = stringResource(id = screen.title),
                style = if (isSelected) {
                    MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Bold)
                } else {
                    MaterialTheme.typography.labelSmall
                },
            )
        },
        icon = {
            Icon(
                imageVector = screen.icon,
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 2.dp)
            )
        },
        selected = isSelected,
        onClick = {
            navController.navigate(screen.route)
        },
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = WhiteColor,
            unselectedIconColor = PaleWhiteColor,
            selectedTextColor = BlackColor,
            unselectedTextColor = PaleBlackColor
        ),
        modifier = Modifier
            .padding(top = 2.dp)
            .height(50.dp)
    )
}