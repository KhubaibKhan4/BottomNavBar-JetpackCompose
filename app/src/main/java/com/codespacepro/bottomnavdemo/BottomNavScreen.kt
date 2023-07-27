package com.codespacepro.bottomnavdemo

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {

    object Home : BottomNavScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Profile : BottomNavScreen(
        route = "profile",
        title = "Profile",
        icon = Icons.Default.AccountBox
    )

    object Detail : BottomNavScreen(
        route = "detail",
        title = "Detail",
        icon = Icons.Default.Settings
    )

}
