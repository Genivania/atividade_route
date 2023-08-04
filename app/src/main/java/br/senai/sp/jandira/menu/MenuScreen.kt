package br.senai.sp.jandira.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
fun MenuScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)

    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                    .fillMaxWidth()
        ) {

            Column(

            ) {

                Button(onClick = { navController.navigate("perfil")}) {
                    Text(text = "PERFIL")
                }

                Button(onClick = {navController.navigate("pedidos")}) {
                    Text(text = "PEDIDOS")
                }

                Button(onClick = { navController.navigate("login")}) {
                    Text(text = "SAIR")
                }
            }
        }


    }
}

//@Preview (showBackground = true)
//@Composable
//fun MenuScreenPreview() {
//    MenuScreen()
//
//}