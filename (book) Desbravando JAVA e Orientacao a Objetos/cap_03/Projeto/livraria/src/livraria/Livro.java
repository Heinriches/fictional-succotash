package livraria;

/**
 * A classe Livro representa um item de livro em uma livraria.
 * Contém informações como nome, descrição, valor e ISBN.
 *
 * @author Fabio
 */

public class Livro {
	
	// --- ATRIBUTOS ---
	String nome;
	String descricao;
	double valor;
	String isbn;
	
	Autor autor;

	
	// --- MÉTODOS ---

	/**
	 * Constructor.
	 */
	public Livro() {
		System.out.println("novo livro criado");
	}
	
	/** 
	 * Exibe os detalhes completos do livro no console.
	 * Se o livro tiver um autor, os detalhes do autor também serão mostrados.
	 */
	void mostrarDetalhes() {
		
		System.out.println("Mostrando detalhes do livro: ");
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: " +isbn);
		
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}

		System.out.println("--");				
	}
	
	/**
     * Aplica um percentual de desconto no valor do livro.
     *
     * @param percentagem O percentual de desconto a ser aplicado.
     * Deve ser um valor entre 0.0 e 0.3 (representando de 10 a 30% de desconto).
     * 
     * @throws IllegalArgumentException Se a porcentagem for negativa ou maior que 0.3.
     */
	public boolean aplicaDescontoDe (double percentagem) {
	
		if(percentagem > 0.3) {
			return false;
		}
		
		this.valor -= this.valor * percentagem;
		return true;
	}
	
	/**
     * Verifica se o livro possui um autor associado.
     *
     * @return {@code true} se o autor não for nulo; {@code false} caso contrário.
     */
	public boolean temAutor() {
		
		boolean naoEhNull = this.autor != null;
		
		return naoEhNull;
	}
	
}
