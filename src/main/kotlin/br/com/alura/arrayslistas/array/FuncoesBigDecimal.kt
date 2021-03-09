package br.com.alura.arrayslistas.array

import java.math.BigDecimal
import java.math.RoundingMode

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
        if (salario < "5000.00".toBigDecimal()) {
            salario + "500.00".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor -> acumulador + valor }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}