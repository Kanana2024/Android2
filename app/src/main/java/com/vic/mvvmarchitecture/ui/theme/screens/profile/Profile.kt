package com.vic.mvvmarchitecture.ui.theme.screens.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.vic.mvvmarchitecture.R

@Composable
fun Profile(){
Column {
    Card {
        Box {
            Image(painter = painterResource(id = R.drawable.card

            ), contentDescription = "card"
            )
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Puzzle")
                
            }
        }
    }
}
}
@Preview
@Composable
fun ProfilePreview()
{
    Profile()
}