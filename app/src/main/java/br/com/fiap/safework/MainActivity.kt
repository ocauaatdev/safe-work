package br.com.fiap.safework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.safework.screens.AssistantScreen
import br.com.fiap.safework.screens.AssistantTopBar
import br.com.fiap.safework.ui.theme.SafeWorkTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SafeWorkTheme {
                AssistantScreen()
            }
        }
    }
}
