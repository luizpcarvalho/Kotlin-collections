package br.com.alura.arrayslistas.list

fun ordenacao() {
    val listaDeLivros = listaDeLivros()

    listaDeLivros.imprimeComMarcadores()

    val ordenadoAnoPublicacao = listaDeLivros.sorted()

    ordenadoAnoPublicacao.imprimeComMarcadores()

    val ordenadoPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    listaDeLivros.sortedBy { it.autor }.imprimeComMarcadores()

    listaDeLivros
            .filter { it.autor.startsWith("J") }
            .sortedBy { it.anoPublicacao }
            .imprimeComMarcadores()

    val listaDeTitulos = listaDeLivros
            .filter { it.autor.startsWith("J") }
            .sortedBy { it.anoPublicacao }
            .map { it.titulo }

    println(listaDeTitulos)
}