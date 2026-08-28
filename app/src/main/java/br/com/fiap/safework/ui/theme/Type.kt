package br.com.fiap.safework.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import br.com.fiap.safework.R


// ============================================================
// POPPINS
// ============================================================

val SafeWorkPoppins = FontFamily(
    Font(
        R.font.poppins_regular,
        FontWeight.Normal
    ),
    Font(
        R.font.poppins_semibold,
        FontWeight.SemiBold
    ),
    Font(
        R.font.poppins_bold,
        FontWeight.Bold
    )
)


// ============================================================
// TIPOGRAFIA SAFEWORK
// ============================================================

val SafeWorkTypography = Typography(

    // --------------------------------------------------------
    // DISPLAY
    // --------------------------------------------------------

    displayLarge = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 34.sp
    ),

    displayMedium = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 30.sp
    ),

    displaySmall = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        lineHeight = 26.sp
    ),


    // --------------------------------------------------------
    // TÍTULOS
    // --------------------------------------------------------

    titleLarge = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp,
        lineHeight = 26.sp
    ),

    titleMedium = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),

    titleSmall = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),


    // --------------------------------------------------------
    // CORPO
    // --------------------------------------------------------

    bodyLarge = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
        lineHeight = 19.sp
    ),

    bodySmall = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 11.sp,
        lineHeight = 16.sp
    ),


    // --------------------------------------------------------
    // LABELS
    // --------------------------------------------------------

    labelLarge = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 13.sp,
        lineHeight = 18.sp
    ),

    labelMedium = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),

    labelSmall = TextStyle(
        fontFamily = SafeWorkPoppins,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        lineHeight = 14.sp
    )
)