package com.example.lingogemi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.lingogemi.data.ChosenLanguage
import com.example.lingogemi.data.Language
import com.example.lingogemi.ui.theme.LightOrange
import com.example.lingogemi.ui.theme.Orange
import java.util.logging.Filter

public var language: String = ""
val availableLanguages: List<Language> = listOf(
    Language("English", "en", R.drawable.uk),
    Language("Spanish", "es", R.drawable.mexico),
    Language("German", "de", R.drawable.germany),
    Language("French", "fr", R.drawable.france),
    Language("Italian", "it", R.drawable.italy),
    Language("Japanese", "jp", R.drawable.japan),
    Language("Swedish", "se", R.drawable.sweeden),
    Language("Korean", "kr", R.drawable.south_korea),
    Language("Chinese", "cn", R.drawable.china)
)

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ChooseLanguage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LightOrange)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(32.dp),
            text = "Choose a language you want to practice:",
            fontSize = 32.sp,
            lineHeight = 41.sp,
            fontWeight = FontWeight.Bold,
            color = Orange,
            style = MaterialTheme.typography.titleMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        FlowRow(
            modifier = Modifier.padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
            )
        {
            for (item in availableLanguages) {
                LanguageChip(item, navController)
            }

        }

        Image(
            imageVector = ImageVector.vectorResource(R.drawable.blooming2kc4),
            contentDescription = "Image with sunflowers",
            modifier = Modifier
                .size(250.dp)
                .offset(y = 75.dp)
        )

    }
}

@Composable
fun LanguageChip(langResources: Language, navController: NavHostController) {

    val interactionSource = remember {
        MutableInteractionSource()
    }

    val isPressed by interactionSource.collectIsPressedAsState()

    val color = if (isPressed) LightOrange else Orange
    val bgColor = if (isPressed) Orange else Color.Transparent

    OutlinedButton(
        modifier = Modifier.padding(top = 10.dp),
        onClick = {
            language = langResources.shortName
            ChosenLanguage.chosenLanguage = langResources.shortName
            navController.navigate(Screen.Chat.route + "/" + language)
        },
        interactionSource = interactionSource,
        border = BorderStroke(1.dp, Orange),
        colors = ButtonDefaults.buttonColors(
            containerColor = bgColor,
            contentColor = color
        )
    ) {
        Row {
            Image (
                imageVector = ImageVector.vectorResource(langResources.icon),
                contentDescription = "Country flag",
                modifier = Modifier.size(32.dp)
            )

            Spacer(
                modifier = Modifier.width(8.dp)
            )

            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = langResources.name,
                fontSize = 20.sp
            )
        }

    }
}