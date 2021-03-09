package br.com.alura.arrayslistas.array

import java.math.BigDecimal
import java.math.RoundingMode

fun testaFuncoes() {
    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
            .map { salario -> calculaAumentoRelativo(salario, aumento) }
            .toTypedArray()

    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto inicial: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto total: $gastoTotal")

    val mediaMaioresSalarios = salariosComAumento
            .sorted()
            .takeLast(3)
            .toTypedArray()
            .media()
    println("Média dos três maiores salários: $mediaMaioresSalarios")

    val mediaMenoresSalarios = salariosComAumento
            .sorted()
            .take(3)
            .toTypedArray()
            .media()
    println("Média dos três menores salários: $mediaMenoresSalarios")
}