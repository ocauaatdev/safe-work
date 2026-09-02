package br.com.fiap.safework.screens

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.ArrowForward
import androidx.compose.material.icons.outlined.PlayCircleOutline
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.safework.R
import br.com.fiap.safework.ui.components.BottomNavigationBar
import br.com.fiap.safework.ui.theme.AppTheme
import br.com.fiap.safework.ui.theme.Poppins

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController, selectedIndex = 0) },
        containerColor = MaterialTheme.colorScheme.background
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .verticalScroll(rememberScrollState())
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 24.dp, vertical = 32.dp)
            ) {
                Text(
                    text = stringResource(R.string.bom_dia),
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 28.sp,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = stringResource(R.string.resumo_diario_cultura),
                    fontFamily = Poppins,
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                    .background(MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f))
                    .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                CultureCard(
                    tag = stringResource(R.string.tag_inclusao),
                    tagColor = Color(0xFF059669), // Greenish
                    tagBgColor = Color(0xFFD1FAE5),
                    title = stringResource(R.string.titulo_capacitismo),
                    description = stringResource(R.string.desc_capacitismo),
                    actionLabel = stringResource(R.string.ler_artigo),
                    actionIcon = Icons.AutoMirrored.Outlined.ArrowForward
                )

                CultureCard(
                    tag = stringResource(R.string.tag_seguranca),
                    tagColor = Color(0xFF2563EB), // Blueish
                    tagBgColor = Color(0xFFDBEAFE),
                    title = stringResource(R.string.titulo_epis),
                    description = stringResource(R.string.desc_epis),
                    actionLabel = stringResource(R.string.assistir_video),
                    actionIcon = Icons.Outlined.PlayCircleOutline
                )
                
                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}

@Composable
fun CultureCard(
    tag: String,
    tagColor: Color,
    tagBgColor: Color,
    title: String,
    description: String,
    actionLabel: String,
    actionIcon: ImageVector
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(24.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier.padding(24.dp)
        ) {
            // Badge
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(tagBgColor)
                    .padding(horizontal = 12.dp, vertical = 6.dp)
            ) {
                Text(
                    text = tag,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 12.sp,
                    color = tagColor
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Title
            Text(
                text = title,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 26.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = description,
                fontFamily = Poppins,
                fontSize = 14.sp,
                color = MaterialTheme.colorScheme.tertiary,
                lineHeight = 22.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(vertical = 4.dp)
            ) {
                Text(
                    text = actionLabel,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color(0xFF0E7C86) // Theme primary color
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(
                    imageVector = actionIcon,
                    contentDescription = null,
                    tint = Color(0xFF0E7C86),
                    modifier = Modifier.size(20.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    AppTheme {
        // HomeScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenDarkPreview() {
    AppTheme {
        // HomeScreen()
    }
}
