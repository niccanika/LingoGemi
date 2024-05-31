package com.example.lingogemi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.lingogemi.ui.theme.LightOrange
import com.example.lingogemi.ui.theme.Orange

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(LightOrange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.chat),
            contentDescription = "Chat image",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "LingoGemi",
            fontSize = 44.sp,
            color = Orange,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Chatbot for language practice",
            fontSize = 18.sp,
            color = Orange,
            style = MaterialTheme.typography.bodyMedium
        )
        
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            modifier = Modifier
                .width(250.dp)
                .height(50.dp)
                .offset(y = 150.dp)
            ,
            colors = ButtonDefaults.buttonColors(Orange),
            onClick = {
            navController.navigate(Screen.Lang.route)
        }) {
            Text(
                text = "Let's start",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = LightOrange
            )
        }
    }
}