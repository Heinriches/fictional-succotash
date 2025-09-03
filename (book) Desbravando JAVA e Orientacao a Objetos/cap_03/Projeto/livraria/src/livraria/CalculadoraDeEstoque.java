package livraria;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		// 1
		double soma = 0;
		
		// 2
		// // 2a
		for(int i = 0; i< 35; i++) {
			soma += 59.90;
		}

		// // 2b
		System.out.println("O total em estoque é " +soma);
		
		// // 2c
		if(soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		} else if(soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom.");
		}
		
	}
}
