package br.com.fiap.safework.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.safework.R
import br.com.fiap.safework.ui.theme.AppTheme

// Cores personalizadas baseadas na imagem
val Teal500 = Color(0xFF009688)
val LightGreenBadge = Color(0xFFE8F5E9)
val LightGreenText = Color(0xFF388E3C)
val LightBlueCard = Color(0xFFE3F2FD)
val DarkNavyButton = Color(0xFF192231)
val GrayTextFieldBackground = Color(0xFFF1F3F4)

@Composable
fun EthicalChannelScreen() {
    // Estados para controlar os inputs e a navegação
    var selectedSubject by remember { mutableStateOf("Denúncia") }
    var descriptionText by remember { mutableStateOf("") }
    var selectedItem by remember { mutableIntStateOf(1) } // 'Canal' é o segundo item

    val scrollState = rememberScrollState()

    Scaffold(
        topBar = {TopBarEthicalChannel()},
        bottomBar = {
            BottomNavigationBar(selectedIndex = 1)
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color.White)
                .verticalScroll(scrollState)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(24.dp))

            // Seção: Qual é o assunto?
            SubjectSelectionGroup(
                selectedSubject = selectedSubject,
                onSubjectSelected = { selectedSubject = it })

            Spacer(modifier = Modifier.height(24.dp))

            // Seção: Descreva o que aconteceu
            DescriptionInputSection(text = descriptionText, onTextChange = { descriptionText = it })

            Spacer(modifier = Modifier.height(24.dp))

            // Botão de Envio
            SendReportButton()

            Spacer(modifier = Modifier.height(32.dp))

            // Seção de Denúncias Externas
            ExternalReportsCard()
        }
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun EthicalChannelScreenPreview() {
    AppTheme() {
        EthicalChannelScreen()
    }
}

@Composable
fun TopBarEthicalChannel(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.background,
        tonalElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.statusBars)
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {

                Text(
                    text = "Canal de Escuta",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp
                    ),
                    color = DarkNavyButton,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                Text(
                    text = "Canal Ético / Acolhimento Anônimo",
                    color = Color.Gray,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

//                Crachá de Anonimato
                AnonymityBadge()
            }
        }
    }

}

@Composable
fun AnonymityBadge() {
    Surface(
        color = LightGreenBadge,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
        ) {
            Icon(
                imageVector = Icons.Outlined.Lock,
                contentDescription = "Ícone de cadeado",
                tint = LightGreenText,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "100% Anônimo",
                color = LightGreenText,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun SubjectSelectionGroup(selectedSubject: String, onSubjectSelected: (String) -> Unit) {
    val subjects = listOf("Denúncia", "EPIs", "Elogio", "Sugestão", "Outro")

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Qual é o assunto?",
            style = MaterialTheme.typography.titleMedium,
            color = DarkNavyButton,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            subjects.forEach { subject ->
                SubjectChip(
                    text = subject,
                    isSelected = subject == selectedSubject,
                    onSelect = { onSubjectSelected(subject) }
                )
            }
        }
    }
}

@Composable
fun SubjectChip(text: String, isSelected: Boolean, onSelect: () -> Unit) {
    Surface(
        color = if (isSelected) DarkNavyButton else GrayTextFieldBackground,
        shape = RoundedCornerShape(20.dp),
        onClick = onSelect,
        modifier = Modifier.padding(vertical = 2.dp)
    ) {
        Text(
            text = text,
            color = if (isSelected) Color.White else Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun DescriptionInputSection(text: String, onTextChange: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Descreva o que aconteceu",
            style = MaterialTheme.typography.titleMedium,
            color = DarkNavyButton,
            modifier = Modifier.padding(bottom = 12.dp)
        )

        OutlinedTextField(
            value = text,
            onValueChange = onTextChange,
            placeholder = {
                Text(
                    text = "Escreva aqui com detalhes. Não se preocupe, sua identidade está protegida...",
                    color = Color.Gray,
                    fontSize = 14.sp
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            shape = RoundedCornerShape(12.dp),
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                unfocusedBorderColor = Color.LightGray,
                focusedBorderColor = Teal500
            )
        )
    }
}

@Composable
fun SendReportButton() {
    Button(
        onClick = { /* Lógica de envio */ },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Teal500,
            contentColor = Color.White
        )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Enviar Relato Anônimo",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.width(10.dp))
            Icon(
                imageVector = Icons.AutoMirrored.Filled.Send,
                contentDescription = "Ícone de enviar",
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
fun ExternalReportsCard() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = LightBlueCard)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            // Título do Cartão com Ícone
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 12.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Info,
                    contentDescription = "Ícone de informação",
                    tint = Color(0xFF1565C0),
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Denúncias Externas",
                    style = MaterialTheme.typography.titleMedium,
                    color = DarkNavyButton,
                    fontWeight = FontWeight.SemiBold
                )
            }

            // Texto descritivo
            Text(
                text = "Para casos graves ou se preferir apoio externo, você pode contatar diretamente os órgãos responsáveis:",
                color = Color(0xFF1565C0),
                fontSize = 14.sp,
                lineHeight = 20.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // Item de contato 1
            ExternalReportContactItem(
                title = "Polícia / Central de Atendimento",
                numbers = "190 / 180",
                icon = Icons.Outlined.Phone
            )

            // Item de contato 2
            ExternalReportContactItem(
                title = "Ministério do Trabalho (Alô Trabalho)",
                numbers = "158",
                icon = Icons.Outlined.WorkOutline // Ou Ícone relacionado ao trabalho
            )
        }
    }
}

@Composable
fun ExternalReportContactItem(title: String, numbers: String, icon: ImageVector) {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = "Ícone do órgão",
                    tint = DarkNavyButton,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = title,
                    color = DarkNavyButton,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            }
            Text(
                text = numbers,
                color = DarkNavyButton,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

data class NavItem(val label: String, val icon: ImageVector)