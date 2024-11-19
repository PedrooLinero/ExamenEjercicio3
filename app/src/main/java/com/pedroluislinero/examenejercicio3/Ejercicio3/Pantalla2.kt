package com.pedroluislinero.examenkotlin.Ejercicio3

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Pantalla2(navController: NavHostController) {
    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Pantalla 2")
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = mensaje,
            onValueChange = { mensaje = it },
            label = { Text("Escribe un mensaje") }
        )
        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = {
                navController.popBackStack()
            }) {
                Text("Volver a Pantalla 1")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {
                navController.navigate("pantalla3")
            }) {
                Text("Ir a Pantalla 3")
            }
        }
    }
}
