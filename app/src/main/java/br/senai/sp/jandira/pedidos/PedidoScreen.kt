package br.senai.sp.jandira.pedidos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun PedidoScreen(navController: NavController) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)

    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Column(


            ) {
                Button(
                    onClick = { navController.navigate("menu")},


                ) {
                    Text(
                        text = "VOLTAR"
                    )
                }
            }
        }
    }
}

//@Preview
//@Composable
///fun PedidoScreenPreview() {
 //   PedidoScreen()
//}