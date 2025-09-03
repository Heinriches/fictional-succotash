package livraria;

public class Livro {
	
	// 1
	String nome;
	String descricao;
	double valor;
	String isbn;
	
	Autor autor;

	// 2
	// // 2a
	void mostrarDetalhes() {
		
		// 2a 1
		System.out.println("Mostrando detalhes do livro: ");
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: " +isbn);
		
		// 2a 2
		autor.mostrarDetalhes();
		System.out.println("--");
				
	}
	
	// // 2b
	public void aplicaDescontoDe (double percentagem) {
	
		// 2b 1
		this.valor -= this.valor * percentagem;
	}
	
}
