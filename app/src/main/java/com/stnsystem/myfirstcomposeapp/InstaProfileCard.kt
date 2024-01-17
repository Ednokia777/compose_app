package com.stnsystem.myfirstcomposeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun InstaProfileCard() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(color = Color.Yellow)
        ) {
        }
        TwoBoxes()
        TwoBoxes()
        TwoBoxes()
    }
}

@Composable
private fun TwoBoxes() {
    Column(
        modifier = Modifier. height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Yellow)
        ) {
//            Column {
//                Text(text = "6.950", textAlign = TextAlign.Center)
//                Text(text = "Posts", textAlign = TextAlign.Center)
//            }
        }
        Box(
            modifier = Modifier
                .size(25.dp)
                .background(color = Color.Magenta)
        ) {
//            Column {
//                Text(text = "436m", textAlign = TextAlign.Center)
//                Text(text = "Followers", textAlign = TextAlign.Center)
//            }
        }
    }
}