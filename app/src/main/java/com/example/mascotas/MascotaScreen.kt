package com.example.mascotas

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

enum class PantallaMascota {
    HOME,
    CATALOGO,
    DETALLE
}

@Composable
fun MascotaScreen(
    modifier: Modifier = Modifier
) {
    var pantallaActual by remember { mutableStateOf(PantallaMascota.HOME) }
    var mascotaSeleccionada by remember { mutableStateOf<Mascota?>(null) }

    when (pantallaActual) {
        PantallaMascota.HOME -> {
            MascotaHomeScreen(
                onVerCatalogoClick = {
                    pantallaActual = PantallaMascota.CATALOGO
                },
                modifier = modifier
            )
        }
        PantallaMascota.CATALOGO -> {
            MascotaCatalogoScreen(
                lista = listaMascotasDummy,
                onMascotaSelect = { mascota ->
                    mascotaSeleccionada = mascota
                    pantallaActual = PantallaMascota.DETALLE
                },
                modifier = modifier
            )
        }
        PantallaMascota.DETALLE -> {
            mascotaSeleccionada?.let { mascota ->
                MascotaDetalleScreen(
                    mascota = mascota,
                    onVolverClick = {
                        pantallaActual = PantallaMascota.CATALOGO
                    },
                    modifier = modifier
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MascotaScreenPreview() {
    MascotaScreen()
}