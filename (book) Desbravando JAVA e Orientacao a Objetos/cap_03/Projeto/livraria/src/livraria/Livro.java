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
		
		System.out.println("Mostrando detalhes do livro: ");
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: " +isbn);
		
		autor.mostrarDetalhes();
		System.out.println("--");
				
	}
	
}
