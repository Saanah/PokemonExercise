package com.example.pokedex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShowPokemon() {

        LazyRow(contentPadding = PaddingValues(horizontal = 0.dp, vertical = 8.dp)) {

            items(3) { item ->
                LazyColumn (horizontalAlignment = Alignment.CenterHorizontally){
                    item() {
                        Text(text = "Bulbasaur")
                        Box(
                            modifier = Modifier
                                .padding(10.dp)
                                .background(color = Color.Blue)
                                .size(100.dp, 100.dp)
                        ) {

                        }
                    }
                }
            }

        }
}

@Preview(showSystemUi = true)
@Composable
fun ShowPokemonPreview() {
    ShowPokemon()
}