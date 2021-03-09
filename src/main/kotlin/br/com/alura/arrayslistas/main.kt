import br.com.alura.arrayslistas.list.Prateleira
import br.com.alura.arrayslistas.list.imprimeComMarcadores
import br.com.alura.arrayslistas.list.listaDeLivros

fun main() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros())

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    println(porAutor.imprimeComMarcadores())
    println(porAnoPublicacao.imprimeComMarcadores())

}







