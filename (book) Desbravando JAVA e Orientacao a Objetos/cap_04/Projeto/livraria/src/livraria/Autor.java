package livraria;

/**
 * A classe `Autor` representa um autor de uma obra na livraria.
 * Contém informações essenciais como nome, email e CPF do autor.
 *
 * @author fabio
 * @version 1.0
 * @since 1.0
 */
public class Autor {
	
	// --- ATRIBUTOS ---
	
	/**
	 * O nome completo do autor.
	 */
	private String nome;
	
	/**
	 * O endereço de email do autor.
	 */
	private String email;
	
	/**
	 * O CPF (Cadastro de Pessoas Físicas) do autor.
	 */
	private String cpf;
	
	
	// --- MÉTODOS ---

	/**
	 * Exibe no console as informações detalhadas do autor,
	 * incluindo nome, email e CPF.
	 */
	public void mostrarDetalhes() {
		
		System.out.println("Mostrando detalhes do autor: ");
		System.out.println("Nome: " + nome);
		System.out.println("e-Mail: " + email);
		System.out.println("CPF: " + cpf);
		
	}


	/**
	 * Retorna o nome do autor.
	 *
	 * @return O nome do autor como uma {@code String}.
	 */
	public String getNome() {
		return nome;
	}


	/**
	 * Define o nome do autor.
	 *
	 * @param nome O nome do autor a ser definido.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}


	/**
	 * Retorna o email do autor.
	 *
	 * @return O email do autor como uma {@code String}.
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * Define o email do autor.
	 *
	 * @param email O email do autor a ser definido.
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * Retorna o CPF do autor.
	 *
	 * @return O CPF do autor como uma {@code String}.
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * Define o CPF do autor.
	 *
	 * @param cpf O CPF do autor a ser definido.
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}