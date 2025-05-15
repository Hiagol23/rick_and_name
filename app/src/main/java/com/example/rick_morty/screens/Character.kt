package com.example.rick_morty.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CharacterCard(
    name: String = "Nome do personagem",
    specie: String = "Espécie do personagem",
    status: String = "Status do personagem",
    image: String = "Url da imagem",
){
    Card(
        modifier = Modifier
            .padding(bottom = 8.dp)
            .fillMaxWidth()
            .height(100.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xbbffffff)
    )
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .size(90.dp),
                    colors = CardDefaults.cardColors(contentColor = Color.Cyan),
                    shape = CircleShape
                ) {
                    AsyncImage(
                        model = "",
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.height)
            }
}