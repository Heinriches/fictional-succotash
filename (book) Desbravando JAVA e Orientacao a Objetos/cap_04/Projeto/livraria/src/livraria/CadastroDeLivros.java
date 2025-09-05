package livraria;

/**
 * A classe CadastroDeLivros é um ponto de entrada para a aplicação de cadastro de livros.
 * Ela demonstra a criação e a interação com objetos das classes Livro e Autor.
 *
 * @author Fabio
 */

public class CadastroDeLivros {
    /**
     * O método main é o ponto de partida do programa.
     *
     * @param args Argumentos de linha de comando. Não são utilizados neste programa.
     */
	public static void main(String[] args) {
		
		// --- Instanciando e configurando o primeiro livro e seu autor ---
		Autor autor = new Autor();
		
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new Livro();
		
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		
		livro.setAutor(autor);
		
		livro.mostrarDetalhes();		
		
		
		// --- Instanciando e configurando o segundo livro e seu autor ---
		Autor outroAutor = new Autor();
		
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("123.456.789-10");
		
		Livro outroLivro = new Livro();
		
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.setAutor(outroAutor);
		
		outroLivro.mostrarDetalhes();
		
	}

}
