package com.example.mascotas

data class Mascota(
    val id: Int,
    val nombre: String,
    val especie: String,
    val edad: Int,
    val pesoKg: Double,
    val descripcion: String
)

val listaMascotasDummy = listOf(
    Mascota(1, "Max", "Perro (Golden Retriever)", 3, 28.5, "Perro muy juguetón, amigable con niños y le encanta correr en el parque."),
    Mascota(2, "Luna", "Gato (Siamés)", 2, 4.2, "Gata tranquila, independiente, vacunada y acostumbrada a departamentos."),
    Mascota(3, "Rocky", "Perro (Bulldog)", 5, 22.0, "Tranquilo, le gusta dormir bastante y es ideal para familias o personas mayores."),
    Mascota(4, "Kiko", "Ave (Loro)", 1, 0.8, "Muy sociable, aprende sonidos rápido y requiere jaula espaciosa con juguetes."),
    Mascota(5, "Nala", "Gato (Persa)", 4, 3.9, "Pelaje abundante, carácter dócil y acostumbrada a cuidados frecuentes de cepillado."),
    Mascota(6, "Bruno", "Perro (Beagle)", 2, 11.3, "Energético, le gusta olfatear todo a su paso y requiere paseos diarios constantes.")
)