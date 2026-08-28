package br.com.fiap.safework.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.AutoAwesome
import androidx.compose.material.icons.outlined.AutoGraph
import androidx.compose.material.icons.outlined.Campaign
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.SpaceDashboard
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.safework.ui.theme.SafeWorkTheme

@Composable
fun AssistantScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Scaffold(
            topBar = { AssistantTopBar() },
            bottomBar = {
                Column {
                    AssistantInputBar()
                    AssistantBottomBar()
                }
            }
        ) { paddingValues ->
            AssistantContent(modifier = Modifier.padding(paddingValues))
        }
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun AssistantScreenPreview() {
    SafeWorkTheme {
        AssistantScreen()
    }
}

@Composable
fun AssistantTopBar(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surface,
        tonalElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.statusBars) // respeita a status bar
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Outlined.AutoAwesome,
                contentDescription = "Icone AutoAwesome",
                tint = MaterialTheme.colorScheme.primary,
                modifier = Modifier.size(40.dp)
            )
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    text = "AI Assistant",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "Online e pronto para ajudar",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun AssistantTopBarPreview() {
    SafeWorkTheme {
        AssistantTopBar()
    }
}

data class BottomNavigationItem(
    val title: String,
    val icon: ImageVector
)

@Composable
fun AssistantBottomBar(modifier: Modifier = Modifier) {
    val items = listOf(
        BottomNavigationItem("Home", Icons.Outlined.Home),
        BottomNavigationItem("Channel", Icons.Outlined.Campaign),
        BottomNavigationItem("AI", Icons.Outlined.AutoAwesome),
        BottomNavigationItem("Climate", Icons.Outlined.AutoGraph),
        BottomNavigationItem("Panel", Icons.Outlined.SpaceDashboard)
    )

    NavigationBar(
        modifier = modifier,
        containerColor = MaterialTheme.colorScheme.background
    ) {
        items.forEach { item ->
            NavigationBarItem(
                selected = false,
                onClick = {},
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title,
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier.size(24.dp)
                    )
                },
                label = {
                    Text(
                        text = item.title,
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            )
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun AssistantBottomBarPreview() {
    SafeWorkTheme {
        AssistantBottomBar()
    }
}

@Composable
fun AssistantContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // mensagem 1
        Card(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 15.dp),
            shape = RoundedCornerShape(16.dp, 16.dp, 16.dp, 4.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
        ) {
            Text(
                text = "Olá! Eu sou a Inteligência Artificial\n" +
                        "do app. Estou aqui para tirar suas\n" +
                        "dúvidas sobre o Código de\n" +
                        "Conduta, linguagem inclusiva ou\n" +
                        "regras de segurança. Como posso\n" +
                        "ajudar?",
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }

        // mensagem 2
        Card(
            modifier = Modifier
                .align(Alignment.End)
                .padding(bottom = 15.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.primary),
            shape = RoundedCornerShape(16.dp, 16.dp, 4.dp, 16.dp)
        ) {
            Text(
                text = "O que o guia fala sobre\n" +
                        "capacitismo?",
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }

        // mensagem 3
        Card(
            modifier = Modifier
                .align(Alignment.Start)
                .padding(bottom = 15.dp),
            shape = RoundedCornerShape(16.dp, 16.dp, 16.dp, 4.dp),
            colors = CardDefaults.cardColors(MaterialTheme.colorScheme.surface)
        ) {
            Text(
                text = "De acordo com o nosso Guia de\n" +
                        "Linguagem Inclusiva, o\n" +
                        "capacitismo é a discriminação\n" +
                        "contra pessoas com deficiência.\n" +
                        "Recomenda-se evitar expressões\n" +
                        "como \"dar uma de cego\" ou \"estar\n" +
                        "surdo\". O ideal é focar na\n" +
                        "competência e na acessibilidade.",
                modifier = Modifier.padding(10.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun AssistantContentPreview() {
    SafeWorkTheme {
        AssistantContent()
    }
}


@Composable
fun AssistantInputBar(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 8.dp)
    ) {
        val sugestoes = listOf("Dúvida sobre EPI", "Linguagem neutra", "O que é capacitismo?")

        LazyRow(
            modifier = Modifier.padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(sugestoes) { sugestao ->
                OutlinedButton(
                    onClick = {},
                    shape = CircleShape,
                    colors = ButtonDefaults.outlinedButtonColors(
                        containerColor = MaterialTheme.colorScheme.surface,
                        contentColor = MaterialTheme.colorScheme.onSurface
                    ),
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp)
                ) {
                    Text(
                        text = sugestao,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }

        OutlinedTextField(
            value = "",
            placeholder = {
                Text(text = "Ask AI something.")
            },
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp, vertical = 8.dp),
            shape = RoundedCornerShape(12.dp),
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = MaterialTheme.colorScheme.surface,
                unfocusedContainerColor = MaterialTheme.colorScheme.surface,
                focusedBorderColor = MaterialTheme.colorScheme.primary,
                unfocusedBorderColor = MaterialTheme.colorScheme.outline,
                focusedTextColor = MaterialTheme.colorScheme.onSurface,
                unfocusedTextColor = MaterialTheme.colorScheme.onSurface
            ),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Send,
                    contentDescription = "Send message",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun AssistantInputBarPreview() {
    SafeWorkTheme {
        AssistantInputBar()
    }
}
