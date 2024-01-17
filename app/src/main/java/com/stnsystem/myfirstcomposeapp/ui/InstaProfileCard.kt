package com.stnsystem.myfirstcomposeapp.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stnsystem.myfirstcomposeapp.R

@Composable
fun InstaProfileCard() {
    Card(
        modifier = Modifier.padding(8.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.onBackground)
    ) {
        Column (
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_insta),
                    contentDescription = "",
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(8.dp)

                )
                UserStatistics("Posts", "6,950")
                UserStatistics("Followers", "436M")
                UserStatistics("Following", "76")
            }
            Text(
                text = "Instagram",
                fontSize = 32.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "№" +
                        "#YoursToMake",
                fontSize = 14.sp,
                fontFamily = FontFamily.Cursive
            )
            Text(
                text = "www.facebook.com/emotional_health",
                fontSize = 14.sp,
                fontFamily = FontFamily.Cursive
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Follow")
            }
        }
    }
}

@Composable
private fun UserStatistics(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier. height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}