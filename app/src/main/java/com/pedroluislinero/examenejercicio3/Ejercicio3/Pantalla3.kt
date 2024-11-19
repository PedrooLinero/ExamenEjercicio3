package com.pedroluislinero.examenejercicio3.Ejercicio3

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Pantalla3(navController: NavHostController, mensaje: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Pantalla 3")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Mensaje: $mensaje")

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Button(onClick = {
                navController.popBackStack() // Volver a la Pantalla 2
            }) {
                Text("Volver a Pantalla 2")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {
                navController.popBackStack("pantalla1", inclusive = false)
            }) {
                Text("Ir a Pantalla 1")
            }
        }
    }
}