fun main() {
    val articulo1 = Articulo("1", 25.0)
    val articulo2 = Articulo("2", 45.0)
    val ordenador1 = Ordenador("1", 1299.99)
    val ordenador2 = Ordenador("2", 399.99)

    val articulos = listOf(articulo1, articulo2, ordenador1, ordenador2)

    for (i in articulos) {
        println(i)
        i.promocionNavidad(20.0)
        println(i)
    }
}