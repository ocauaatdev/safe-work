package br.com.fiap.safework.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext


// ============================================================
// TEMA CLARO
// ============================================================

private val LightColorScheme = lightColorScheme(

    primary = SafeWorkGreen,
    onPrimary = Color.White,

    primaryContainer = SafeWorkGreenLight,
    onPrimaryContainer = SafeWorkGreenDark,

    secondary = SafeWorkGreenDark,
    onSecondary = Color.White,

    secondaryContainer = SafeWorkGreenLight,
    onSecondaryContainer = SafeWorkGreenDark,

    tertiary = SafeWorkBlue,
    onTertiary = Color.White,

    tertiaryContainer = SafeWorkBlueLight,
    onTertiaryContainer = SafeWorkBlue,

    background = SafeWorkBackground,
    onBackground = SafeWorkTextPrimary,

    surface = SafeWorkSurface,
    onSurface = SafeWorkTextPrimary,

    surfaceVariant = SafeWorkSurfaceVariant,
    onSurfaceVariant = SafeWorkTextSecondary,

    outline = SafeWorkBorder,

    error = SafeWorkRed,
    onError = Color.White,

    errorContainer = SafeWorkRedLight,
    onErrorContainer = SafeWorkRed
)


// ============================================================
// TEMA ESCURO
// ============================================================

private val DarkColorScheme = darkColorScheme(

    primary = SafeWorkDarkGreen,
    onPrimary = Color(0xFF00382A),

    primaryContainer = Color(0xFF005A44),
    onPrimaryContainer = Color(0xFFA7F3D7),

    secondary = SafeWorkGreen,
    onSecondary = Color.White,

    secondaryContainer = Color(0xFF005A44),
    onSecondaryContainer = Color(0xFFA7F3D7),

    tertiary = SafeWorkBlue,
    onTertiary = Color.White,

    tertiaryContainer = Color(0xFF1E40AF),
    onTertiaryContainer = Color(0xFFDBEAFE),

    background = SafeWorkDarkBackground,
    onBackground = SafeWorkDarkTextPrimary,

    surface = SafeWorkDarkSurface,
    onSurface = SafeWorkDarkTextPrimary,

    surfaceVariant = SafeWorkDarkSurfaceVariant,
    onSurfaceVariant = SafeWorkDarkTextSecondary,

    outline = SafeWorkDarkBorder,

    error = SafeWorkRed,
    onError = Color.White,

    errorContainer = Color(0xFF7F1D1D),
    onErrorContainer = Color(0xFFFECACA)
)


// ============================================================
// SAFEWORK THEME
// ============================================================

@Composable
fun SafeWorkTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {

    val colorScheme = when {

        dynamicColor &&
                Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {

            val context = LocalContext.current

            if (darkTheme) {
                dynamicDarkColorScheme(context)
            } else {
                dynamicLightColorScheme(context)
            }
        }

        darkTheme -> DarkColorScheme

        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = SafeWorkTypography,
//        shapes = SafeWorkShapes,
        content = content
    )
}