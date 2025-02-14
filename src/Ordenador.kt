class Ordenador(nombre: String,
                precio: Double,
                val tipoOrdenador: TipoOrdenador = TipoOrdenador.BASICO
): Articulo(nombre, precio) {

    override fun promocionNavidad(rebaja: Double) {
        if(precio > 500) super.promocionNavidad(rebaja)
    }
}