package com.pedroluislinero.examenkotlin.Ejercicio3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pedroluislinero.examenejercicio3.Ejercicio3.Pantalla1
import com.pedroluislinero.examenejercicio3.Ejercicio3.Pantalla3

/* Ejercicio 3: Navegación con parámetros y vuelta atrás
Objetivo: Crear una aplicación sencilla de dos pantallas donde se pueda navegar de una pantalla
a otra pasando un parámetro, y luego regresar a la pantalla original.
Pasos:
1. Define una estructura de navegación simple con tres pantallas.
2. De la primera a la segunda se pasará mediante un botón.
3. De la segunda se podrá volver a la primera, e ir a la tercera, a esta última se pasará un
mensaje que escribirá el usuario. Se usarán botones
4. La tercera mostrará el mensaje recibido y dos iconos para ir hacia atrás y al inicio. */


@Composable
fun NavegacionApp(navController: NavHostController) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "pantalla1"){
        composable("pantalla1"){
            Pantalla1(navController)
        }
        composable("pantalla2"){
            Pantalla2(navController)
        }

        composable("pantalla3"){
            Pantalla3(navController, "Mensaje")
        }
    }
}
