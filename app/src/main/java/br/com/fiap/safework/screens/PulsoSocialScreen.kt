package br.com.fiap.safework.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.safework.R
import br.com.fiap.safework.ui.theme.AppTheme

@Composable
fun PulsoSocialScreen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        bottomBar = { BottomNavigationBar(selectedIndex = 3) },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(24.dp)
        ) {
            // Cabeçalho da tela (título + subtítulo), padronizado com TransparencyScreen
            Text(
                text = stringResource(id = R.string.screen_name),
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = stringResource(id = R.string.quick_survey),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.tertiary
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Barra de progresso da pesquisa
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(5.dp)
                    .background(
                        color = Color(0xFFE1E1E8),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {
                Box(
                    modifier = Modifier
                        .width(165.dp)
                        .height(5.dp)
                        .background(
                            color = Color(0xFF059669),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // CARD 1 - COMO VOCÊ SE SENTIU
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(
                            elevation = 4.dp,
                            shape = RoundedCornerShape(20.dp),
                            ambientColor = Color.Black.copy(alpha = 0.03f),
                            spotColor = Color.Black.copy(alpha = 0.03f)
                        )
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(24.dp)
                ) {

                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {

                        Text(
                            text = stringResource(R.string.feeling_question),
                            style = MaterialTheme.typography.titleMedium,
                            color = Color(0xFF1F2937)
                        )

                        Spacer(
                            modifier = Modifier.height(20.dp)
                        )

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.nervous_emoji),
                                contentDescription = stringResource(R.string.emoji_nervoso),
                                modifier = Modifier.size(28.dp),
                                alpha = 0.4f
                            )
                            Image(
                                painter = painterResource(id = R.drawable.sad_emoji),
                                contentDescription = stringResource(R.string.emoji_triste),
                                modifier = Modifier.size(28.dp),
                                alpha = 0.4f
                            )
                            Image(
                                painter = painterResource(id = R.drawable.unconfortable_emoji),
                                contentDescription = stringResource(R.string.emoji_desconfortavel),
                                modifier = Modifier.size(28.dp),
                                alpha = 0.4f
                            )
                            Image(
                                painter = painterResource(id = R.drawable.happy_emoji),
                                contentDescription = stringResource(R.string.emoji_feliz),
                                modifier = Modifier.size(28.dp),
                                alpha = 0.4f
                            )
                            Image(
                                painter = painterResource(id = R.drawable.stareyes_emoji),
                                contentDescription = stringResource(R.string.emoji_olho_estrelado),
                                modifier = Modifier.size(28.dp),
                                alpha = 0.4f
                            )
                        }
                    }
                }

                // CARD 2 - ATITUDE EXCLUDENTE
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(146.dp)
                        .shadow(
                            elevation = 4.dp,
                            shape = RoundedCornerShape(20.dp),
                            ambientColor = Color.Black.copy(alpha = 0.03f),
                            spotColor = Color.Black.copy(alpha = 0.03f)
                        )
                        .background(
                            color = Color.White,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(24.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(R.string.exclusion_question),
                            style = MaterialTheme.typography.titleMedium,
                            color = Color(0xFF1F2937)
                        )
                        Spacer(
                            modifier = Modifier.height(20.dp)
                        )
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {

                            // BOTÃO SIM
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(48.dp)
                                    .border(
                                        width = 1.dp,
                                        color = Color(0xFFE5E7EB),
                                        shape = RoundedCornerShape(16.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.yes),
                                    style = MaterialTheme.typography.labelMedium,
                                    color = Color(0xFF6B7280)
                                )
                            }

                            // BOTÃO NÃO
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(48.dp)
                                    .border(
                                        width = 1.dp,
                                        color = Color(0xFF059669),
                                        shape = RoundedCornerShape(16.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = stringResource(R.string.no),
                                    style = MaterialTheme.typography.labelMedium,
                                    color = Color(0xFF059669)
                                )
                            }
                        }
                    }
                }

                // BOTÃO ENVIAR RESPOSTAS
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .background(
                            color = Color(0xFF059669),
                            shape = RoundedCornerShape(16.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.submit_answers),
                            style = MaterialTheme.typography.labelMedium,
                            color = Color.White
                        )

                        Text(
                            text = "✓",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
fun PulsoSocialScreenPreview() {
    AppTheme {
        PulsoSocialScreen()
    }
}
