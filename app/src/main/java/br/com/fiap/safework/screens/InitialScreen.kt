package br.com.fiap.safework.screens

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.safework.R
import br.com.fiap.safework.ui.theme.AppTheme

@Composable
fun InitialScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(24.dp))


            .background(Color(0xFFF7F7F7))
    ){
        //imagem home afro
        Image(
            painter = painterResource(id = R.drawable.afrodescendente_male),
            contentDescription = "Ilustração homem afordescendente",
            modifier = Modifier
                .size(90.dp)
                .align(Alignment.TopStart)
                .offset(
                    x = 10.dp,
                    y = 285.dp)
        )

        //mulher de burca
        Image(
            painter = painterResource(id = R.drawable.burqa_female),
            contentDescription = "Ilustração mulher de burca",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .width(125.dp)
                .height(180.dp)
                .align(Alignment.BottomEnd)
                .offset(
                    x = 10.dp,
                    y = (-10).dp)
        )
        //circulo azul topstart
        Box(
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.TopStart)
                .offset(x = (-45).dp, y = 45.dp)
                .border(
                    width = 10.dp,
                    color = Color(0xFF246BEB),
                    shape = CircleShape
                )
        )

        //bolinha salmão do circulo azul topstart
        Box(
            modifier = Modifier
                .size(40.dp)
                .align(Alignment.TopStart)
                .offset(x = 10.dp, y = 85.dp)
                .background(
                    color = Color(0xFFFA8072),
                    shape = CircleShape
                )
        )

        //bolinha cinza clara quase trasnparente
        Box(
            modifier = Modifier
                .size(32.dp)
                .align(Alignment.TopEnd)
                .offset(x = (-80).dp, y = 170.dp)
                .background(
                    color = Color(0xFFE8EAF0),
                    shape = CircleShape
                )
        )

        Box(
            modifier = Modifier
                .size(160.dp, 130.dp)
                .align(Alignment.BottomStart)
                .offset(x = (-45).dp, y = (-70).dp)
                .border(
                    width = 14.dp,
                    color = Color(0xFF9AADE8),
                    shape = CircleShape
                )
        )



        //circulo azul topend
        Box(
            modifier = Modifier
                .size(170.dp)
                .align(Alignment.TopEnd)
                .offset(x = 60.dp, y = 20.dp)
                .border(
                    width = 14.dp,
                    color = Color(0xFF246BEB),
                    shape = CircleShape
                )
        )



        //logo principal
        Image(
            painter = painterResource(id = R.drawable.logo_principal),
            contentDescription = "Logo SafeWork",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(280.dp)
                .align(Alignment.TopCenter)
                .offset(y = 150.dp)
        )




        Text(
            text = stringResource(R.string.app_name),
            fontSize = 32.sp,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y= (-80).dp),
        )
        HorizontalDivider(
            modifier = Modifier
                .width(70.dp)
                .align(Alignment.Center)
                .offset(y = (-40).dp),
            thickness = 1.dp
        )
        Text(
            text = stringResource(R.string.welcome_message),
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 30.dp)
        )
        Text(
            text = stringResource(R.string.start_button),
            fontSize = 20.sp,
            color = Color(0xFF333333),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 230.dp)
                .width(180.dp)
                .height(52.dp)
                .background(
                    color = Color(0xFFDCE9F5),
                    shape = RoundedCornerShape(14.dp)
                )
                .wrapContentHeight(Alignment.CenterVertically)
        )

    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES )
fun InitialScreenPreview(){
    AppTheme {
        InitialScreen()
    }


}