package br.com.cliente;

public class Cliente {
	
	public int id;
	private String nome;
	private String email;
	
	/*
	 * Metodos de acesso get set....
	 */
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return this.email;
	}
	
	
	
	
	
	
	
	/*
	 * Sempre publico
	 * Sempre com o mesmo nome da classe
	 * nao tem tipo de retorno ou seja nao é void ou qualquer tipo
	 */
	public Cliente(int id, String nome, String email) {
		this.id = id;
		this.nome= nome;
		this.email = email;
	}
	
	public Cliente() {}
		
	
	public String cadastrar( ) {
		return "Cadastro realizado";
	}
	
	public String nomePorId(int id) {
		
		String msg="";
		if(this.id==id) {
			msg = this.nome;
	}
		else {
			msg = "Não localizado";			
		}
		return msg;	
		}
}	
