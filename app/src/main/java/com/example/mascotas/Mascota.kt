package com.example.mascotas

data class Mascota(
    val id: Int,
    val nombre: String,
    val especie: String,
    val edad: Int,
    val pesoKg: Double,
    val descripcion: String,
    val imagenUrl: String
)

val listaMascotasDummy = listOf(
    Mascota(1, "Max", "Perro (Golden Retriever)", 3, 28.5, "Perro muy juguetón, amigable con niños y le encanta correr en el parque.", "https://images.unsplash.com/photo-1552053831-71594a27632d"),
    Mascota(2, "Luna", "Gato (Siamés)", 2, 4.2, "Gata tranquila, independiente, vacunada y acostumbrada a departamentos.", "https://images.unsplash.com/photo-1514888286974-6c03e2ca1dba"),
    Mascota(3, "Rocky", "Perro (Bulldog)", 5, 22.0, "Tranquilo, le gusta dormir bastante y es ideal para familias o personas mayores.", "https://images.unsplash.com/photo-1583511655857-d19b40a7a54e"),
    Mascota(4, "Kiko", "Ave (Loro)", 1, 0.8, "Muy sociable, aprende sonidos rápido y requiere jaula espaciosa con juguetes.", "https://images.unsplash.com/photo-1552728089-57bdde30beb3"),
    Mascota(5, "Nala", "Gato (Persa)", 4, 3.9, "Pelaje abundante, carácter dócil y acostumbrada a cuidados frecuentes de cepillado.", "https://images.unsplash.com/photo-1573865526739-10659fec78a5"),
    Mascota(6, "Bruno", "Perro (Beagle)", 2, 11.3, "Energético, le gusta olfatear todo a su paso y requiere paseos diarios constantes.", "https://images.unsplash.com/photo-1537151608828-ea2b11777ee8")
)