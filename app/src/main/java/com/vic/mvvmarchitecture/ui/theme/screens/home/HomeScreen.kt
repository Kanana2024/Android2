package com.vic.mvvmarchitecture.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.vic.mvvmarchitecture.navigation.ROUTE_LOGIN

@Composable
fun HomeScreen(navController: NavController){
    Column (modifier = Modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Welcome to the home screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN) }) {
            Text(text = "Products")

        }
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}