package livraria;

/**
 * A classe RegrasDeDesconto é um ponto-de-entrada para o teste das 
 * regras-de-negócio relativas à aplicação de desconto sobre os 
 * itens da livraria.
 * Ela demonstra a criação e interação com objetos da classe 'Livros'.
 * 
 * @author fabio
 */
public class RegrasDeDesconto {
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.valor = 59.90;
		
		System.out.println("Valor atual: " +livro.valor);
		
		if(! livro.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior do que 30%.");
		} else {
			System.out.println("Valor com desconto: " +livro.valor);
		}
		
	}

}
