package com.example.mascotas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MascotaDetalleScreen(
    mascota: Mascota,
    onVolverClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalle de la Mascota") },
                navigationIcon = {
                    TextButton(onClick = onVolverClick) {
                        Text("← Volver", fontWeight = FontWeight.Bold)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card(
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
                modifier = Modifier
                    .size(120.dp)
                    .padding(8.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = "🐾", fontSize = 50.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = mascota.nombre,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )

            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp))

            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "ID Registro: ${mascota.id}", style = MaterialTheme.typography.bodyLarge)
                Text(text = "Especie / Raza: ${mascota.especie}", style = MaterialTheme.typography.bodyLarge)
                Text(text = "Edad: ${mascota.edad} años", style = MaterialTheme.typography.bodyLarge)
                Text(text = "Peso Corporal: ${mascota.pesoKg} kg", style = MaterialTheme.typography.bodyLarge)

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Descripción general:",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = mascota.descripcion,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MascotaDetalleScreenPreview() {
    MaterialTheme {
        MascotaDetalleScreen(
            mascota = listaMascotasDummy[0],
            onVolverClick = {}
        )
    }
}