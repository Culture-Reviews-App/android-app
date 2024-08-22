package com.eb.culturereviews.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.eb.culturereviews.R

val bioRyhmeFontFamily = FontFamily(
    Font(R.font.biorhyme_bold, FontWeight.Bold),
    Font(R.font.biorhyme_light, FontWeight.Light),
    Font(R.font.biorhyme_extrabold, FontWeight.ExtraBold),
    Font(R.font.biorhyme_extralight, FontWeight.ExtraLight),
    Font(R.font.biorhyme_regular, FontWeight.Normal),
    Font(R.font.biorhyme_semibold, FontWeight.SemiBold),
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleMedium = TextStyle(
        fontFamily = bioRyhmeFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 24.sp,
    ),

    bodyMedium = TextStyle(
        fontFamily = bioRyhmeFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),

    bodySmall = TextStyle(
        fontFamily = bioRyhmeFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 13.sp,
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)