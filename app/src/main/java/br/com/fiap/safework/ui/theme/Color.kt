package br.com.fiap.safework.ui.theme

import androidx.compose.ui.graphics.Color

/*
 * Paleta inspirada no logotipo do SafeWork:
 * - Turquesa (figura maior do logo)  -> cor primária: acolhimento e segurança
 * - Roxo (figura menor do logo)      -> cor secundária: cuidado e diversidade
 * - Laranja (traço que une as duas)  -> cor de destaque: energia e atenção
 */

// ---------- TEMA CLARO ----------
val LightPrimary = Color(0xFF0E7C86)
val LightSecondary = Color(0xFF7C3AED)
val LightBackground = Color(0xFFF8FAFC)
val LightSurface = Color(0xFFFFFFFF)
val LightOnPrimary = Color(0xFFFFFFFF)
val LightOnSecondary = Color(0xFFFFFFFF)
val LightOnBackground = Color(0xFF0F172A)
val LightOnSurface = Color(0xFF1E293B)
val LightTertiary = Color(0xFF64748B)
val LightOnTertiary = Color(0xFFFFFFFF)

// Superfície alternativa (usada em bordas/divisores sutis, ex.: PrivacyBanner)
val LightSurfaceVariant = Color(0xFFE7ECF1)
val LightOnSurfaceVariant = Color(0xFF48566B)

// Cor de destaque (laranja do traço que une as figuras do logo)
val LightAccent = Color(0xFFEA580C)
val LightOnAccent = Color(0xFFFFFFFF)

// ---------- TEMA ESCURO ----------
val DarkPrimary = Color(0xFF2DD4BF)
val DarkSecondary = Color(0xFFA78BFA)
val DarkBackground = Color(0xFF0F172A)
val DarkSurface = Color(0xFF1E293B)
val DarkOnPrimary = Color(0xFF00201F)
val DarkOnSecondary = Color(0xFF1E1147)
val DarkOnBackground = Color(0xFFF8FAFC)
val DarkOnSurface = Color(0xFFF8FAFC)
val DarkTertiary = Color(0xFF94A3B8)
val DarkOnTertiary = Color(0xFF000000)

val DarkSurfaceVariant = Color(0xFF334155)
val DarkOnSurfaceVariant = Color(0xFFCBD5E1)

val DarkAccent = Color(0xFFFB923C)
val DarkOnAccent = Color(0xFF3A1B03)

// ícones dos cards — fundos suaves que acompanham primary/secondary/accent
val LightBlueIconBg = Color(0xFFEDE4FF)    // combina com secondary (roxo)
val LightGreenIconBg = Color(0xFFDDF6F2)   // combina com primary (turquesa)
val LightOrangeIconBg = Color(0xFFFFE4D1)  // combina com accent (laranja)
