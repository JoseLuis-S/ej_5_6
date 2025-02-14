import kotlin.random.Random

open class Articulo(val nombre: String, var precio: Double) {
    private var id: String = generarId()

    fun generarId(): String {
        val temp = Random.nextInt(0, 9999)
        return "ID_$temp"
    }

    open fun promocionNavidad(rebaja: Double) {
        precio = precio * ((100 - rebaja) / 100)
    }

    override fun toString(): String {
        return "$nombre - ${String.format("%.2f", precio)}€ (ID: $id)"
    }
}