package com.vic.mvvmarchitecture.ui.theme.screens.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun RegisterScreen(navController: NavController){
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Please register here")
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { /*TODO*/ })
        {
            Text(text = "Go to login screen")
        }
    }
}
@Preview
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())

}