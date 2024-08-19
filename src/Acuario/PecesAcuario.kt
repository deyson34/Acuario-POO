package Acuario

interface AccionPez {
    fun comer()
}

abstract class PecesAcuario {
    abstract val color: String
}

class Tiburon : PecesAcuario(), AccionPez {
    override val color = "Negro"

    override fun comer() {
        println("Tiburón: cazar y comer peces")
    }
}

class PezPayaso : PecesAcuario(), AccionPez {
    override val color = "Naranja con Blanco"

    override fun comer() {
        println("Pez Payaso: comer algas")
    }
}