package com.poo.heranca;

public class PessoaJuridica extends Cliente {
	private String razaoSocial;
	private String Cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica() {
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia) {
		this.razaoSocial = razaoSocial;
		Cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public PessoaJuridica(String razaoSocial, String cnpj, String nomeFantasia, int id, String email, String endereco, String telefone) {
		this.razaoSocial = razaoSocial;
		Cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		super.setId(id);
		super.setEmail(email);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String cnpj) {
		Cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public void cadastrar() {
		System.out.println("Os dados do cliente foram cadastrados");
	}
	
	
}
