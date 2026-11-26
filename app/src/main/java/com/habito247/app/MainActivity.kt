
package com.habito247.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Fondo = Color(0xFF101827)
private val Tarjeta = Color(0xFF1B293B)
private val Dorado = Color(0xFFD6AE62)
private val Texto = Color(0xFFF4F1E9)
private val Secundario = Color(0xFFAAB4C2)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                PantallaPrincipal()
            }
        }
    }
}

@Composable
fun PantallaPrincipal() {
    Scaffold(
        containerColor = Fondo
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "HÁBITO 24/7",
                    color = Dorado,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Organiza tu tiempo. Construye tu futuro.",
                    color = Secundario,
                    fontSize = 13.sp
                )
            }

            item {
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = Tarjeta
                    ),
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(
                            text = "TU DÍA, BAJO CONTROL",
                            color = Dorado,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Cada hora cuenta.",
                            color = Texto,
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Tu planificación inteligente comienza aquí.",
                            color = Secundario,
                            fontSize = 14.sp
                        )
                    }
                }
            }

            item {
                Text(
                    text = "MI ORGANIZACIÓN",
                    color = Dorado,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            item {
                Modulo(
                    titulo = "Mi jornada",
                    descripcion = "Organiza trabajo, descanso y compromisos."
                )
            }

            item {
                Modulo(
                    titulo = "Mis hábitos",
                    descripcion = "Entrenamiento, alimentación y rutinas."
                )
            }

            item {
                Modulo(
                    titulo = "Biblioteca",
                    descripcion = "Registra libros y controla tu lectura."
                )
            }

            item {
                Modulo(
                    titulo = "Mis objetivos",
                    descripcion = "Convierte tus metas en acciones diarias."
                )
            }

            item {
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "HÁBITO 24/7  •  VERSIÓN 1.0",
                    color = Secundario,
                    fontSize = 11.sp,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(bottom = 24.dp)
                )
            }
        }
    }
}

@Composable
fun Modulo(
    titulo: String,
    descripcion: String
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = Tarjeta
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(18.dp)
        ) {
            Text(
                text = titulo,
                color = Texto,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = descripcion,
                color = Secundario,
                fontSize = 13.sp
            )
        }
    }
}
