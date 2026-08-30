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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.ContentDescription
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.safework.R
import br.com.fiap.safework.ui.theme.AppTheme

@Composable
fun PulsoSocialScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F7F7))
    ) {
        //Titulo da tela
        Text(
            text = stringResource(R.string.screen_name),
            modifier = Modifier
                .padding(start = 24.dp, top = 32.dp),
            style = MaterialTheme.typography.titleLarge,
            color = Color(0xFF1F1F1F)
        )
        //Barra cinza
        Box(
            modifier = Modifier
                .padding(start = 24.dp, top = 72.dp, end = 24.dp)
                .fillMaxWidth()
                .height(5.dp)
                .background(
                    color = Color(0xFFE1E1E8),
                    shape = RoundedCornerShape(10.dp)
                )
        )

        //barra pedacinho em verde
        Box(
            modifier = Modifier
                .padding(start = 24.dp, top = 72.dp)
                .width(165.dp)
                .height(5.dp)
                .background(
                    color = Color(0xFF059669),
                    shape = RoundedCornerShape(10.dp)
                )
        )

        //pesquisa rapida
        Text(
            text = stringResource(R.string.quick_survey),
            modifier = Modifier
                .padding(start = 24.dp, top = 88.dp),
            style = MaterialTheme.typography.bodySmall,
            color = Color(0xFF6B7280)
        )
        //caixa branca do questionario

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 24.dp,
                    end = 24.dp,
                    top = 120.dp
                ),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // CARD 1 - COMO VOCÊ SE SENTIU
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    //.height(135.dp)
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
                            contentDescription = "Nervoso",
                            modifier = Modifier.size(28.dp),
                            alpha = 0.4f
                        )
                        Image(
                            painter = painterResource(id = R.drawable.sad_emoji),
                            contentDescription = "Triste",
                            modifier = Modifier.size(28.dp),
                            alpha = 0.4f
                        )
                        Image(
                            painter = painterResource(id = R.drawable.unconfortable_emoji),
                            contentDescription = "Desconfortável",
                            modifier = Modifier.size(28.dp),
                            alpha = 0.4f
                        )
                        Image(
                            painter = painterResource(id = R.drawable.happy_emoji),
                            contentDescription = "Feliz",
                            modifier = Modifier.size(28.dp),
                            alpha = 0.4f
                        )
                        Image(
                            painter = painterResource(id = R.drawable.stareyes_emoji),
                            contentDescription = "Olho estrelado",
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
                        text = stringResource(R.string.excluison_question),
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
                                text = "Sim",
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
                                text = "Não",
                                style = MaterialTheme.typography.labelMedium,
                                color = Color(0xFF059669)
                            )
                        }
                    }
                   // **********
                }

                //******

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

// RODAPÉ
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .height(72.dp)
                .background(Color.White)
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            // home
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.home),
                    contentDescription = "Início",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFB8B8D8)
                )

                Text(
                    text = "Início",
                    fontSize = 12.sp,
                    color = Color(0xFFB8B8D8)
                )
            }

            // news
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.news__2_),
                    contentDescription = "Canal",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFB8B8D8)
                )

                Text(
                    text = "Canal",
                    fontSize = 12.sp,
                    color = Color(0xFFB8B8D8)
                )
            }

            // IA
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.ia__2_),
                    contentDescription = "IA",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFB8B8D8)
                )

                Text(
                    text = "IA",
                    fontSize = 12.sp,
                    color = Color(0xFFB8B8D8)
                )
            }

            // graphics
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.graphics),
                    contentDescription = "Clima",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFF059669)
                )

                Text(
                    text = "Clima",
                    fontSize = 12.sp,
                    color = Color(0xFF059669)
                )
            }

            // pie_chart
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(R.drawable.pie_chart),
                    contentDescription = "Painel",
                    modifier = Modifier.size(24.dp),
                    tint = Color(0xFFB8B8D8)
                )

                Text(
                    text = "Painel",
                    fontSize = 12.sp,
                    color = Color(0xFFB8B8D8)
                )
            }
        }

    }


    }


    @Composable
    @Preview(
        showBackground = true,
        showSystemUi = true,
        uiMode = Configuration.UI_MODE_NIGHT_YES
    )
    fun PulsoSocialScreenPreview() {
        AppTheme() {
            PulsoSocialScreen()
        }

    }

