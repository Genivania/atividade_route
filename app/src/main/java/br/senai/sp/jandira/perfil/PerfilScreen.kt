package br.senai.sp.jandira.perfil

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PerfilScreen(navController: NavController, nome:String, idade:String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)

    ) {

        Row(
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Column {

                Text(text ="PERFIL - $nome - $idade" ,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold ,
                    color = Color.White

                )
                Button(onClick = { navController.navigate("menu")}) {
                    Text(text = "VOLTAR")
                }
            }
        }


    }
}

//@Preview
//@Composable
//fun PerfilScreenPreview() {
//    PerfilScreen()
//}