package br.com.alura.arrayslistas.list

fun atributosNulos() {
    val listaDeLivros = listaDeLivros()
    listaDeLivros
            .groupBy { it.editora ?: "Editora desconhecida" }
            .forEach { (editora, livros) ->
                println("$editora: ${livros.joinToString { it.titulo }}")
            }
}