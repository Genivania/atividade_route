package br.senai.sp.jandira.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun LoginScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)

    ) {
      //  Column(

      //  ) {
      //      Text(text = "MENU")
      //  }
       Row(
           horizontalArrangement = Arrangement.Center,
           modifier = Modifier
               .fillMaxWidth()

       ) {
           Column(


           ) {
               Button(onClick = { navController.navigate("menu")}) {
                   Text(text = "ENTRAR")
               }
           }
       }


    }
}

//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen()
//}