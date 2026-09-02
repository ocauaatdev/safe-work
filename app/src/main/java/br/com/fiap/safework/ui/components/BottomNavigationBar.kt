package br.com.fiap.safework.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.GridView
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.InsertChartOutlined
import androidx.compose.material.icons.outlined.PieChart
import androidx.compose.material.icons.outlined.SmartToy
import androidx.compose.material.icons.outlined.TrendingUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.safework.R

/**
 * @param selectedIndex índice do item que deve aparecer selecionado
 * (0 = Início, 1 = Canal, 2 = IA, 3 = Clima, 4 = Painel).
 */
@Composable
fun BottomNavigationBar(navController: NavController, selectedIndex: Int) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        tonalElevation = 8.dp
    ) {
        val items = listOf(
            Triple(R.string.nav_inicio, Icons.Outlined.Home, "home"),
            Triple(R.string.nav_canal, Icons.Outlined.Campaign, "ethical_channel"),
            Triple(R.string.nav_ia, Icons.Outlined.SmartToy, "assistant"),
            Triple(R.string.nav_clima, Icons.Outlined.InsertChartOutlined, "social_pulse"),
            Triple(R.string.nav_painel, Icons.Outlined.PieChart, "transparency")
        )

        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = index == selectedIndex,
                onClick = {
                    if (index != selectedIndex) {
                        navController.navigate(item.third) {
                            popUpTo("home") { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                },
                icon = {
                    Icon(
                        imageVector = item.second,
                        contentDescription = stringResource(id = item.first)
                    )
                },
                label = {
                    Text(
                        text = stringResource(id = item.first),
                        style = MaterialTheme.typography.labelSmall
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.tertiary,
                    unselectedTextColor = MaterialTheme.colorScheme.tertiary,
                    indicatorColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    }
}
