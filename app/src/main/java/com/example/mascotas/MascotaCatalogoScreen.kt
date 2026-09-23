package com.example.mascotas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MascotaCatalogoScreen(
    lista: List<Mascota>,
    onMascotaSelect: (Mascota) -> Unit,
    onVolverHomeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Catálogo de Mascotas") },
                navigationIcon = {
                    TextButton(onClick = onVolverHomeClick) {
                        Text("← Inicio", fontWeight = FontWeight.Bold)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(
                items = lista,
                key = { it.id }
            ) { mascota ->
                MascotaItem(
                    mascota = mascota,
                    onItemClick = onMascotaSelect
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MascotaCatalogoScreenPreview() {
    MaterialTheme {
        MascotaCatalogoScreen(
            lista = listaMascotasDummy,
            onMascotaSelect = {},
            onVolverHomeClick = {}
        )
    }
}