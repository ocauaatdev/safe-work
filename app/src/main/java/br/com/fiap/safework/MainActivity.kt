package br.com.fiap.safework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.safework.screens.AssistantScreen
import br.com.fiap.safework.screens.EthicalChannelScreen
import br.com.fiap.safework.screens.HomeScreen
import br.com.fiap.safework.screens.InitialScreen
import br.com.fiap.safework.screens.TransparencyScreen
import br.com.fiap.safework.screens.PulsoSocialScreen
import br.com.fiap.safework.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "initial") {
                    composable("initial") {
                        InitialScreen(onStartClick = {
                            navController.navigate("home") {
                                popUpTo("initial") { inclusive = true }
                            }
                        })
                    }
                    composable("home") { HomeScreen(navController) }
                    composable("ethical_channel") { EthicalChannelScreen(navController) }
                    composable("assistant") { AssistantScreen(navController) }
                    composable("social_pulse") { PulsoSocialScreen(navController) }
                    composable("transparency") { TransparencyScreen(navController) }
                }
            }
        }
    }
}
