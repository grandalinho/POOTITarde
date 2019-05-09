package com.loja;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private Caregoria categoria;
	private Fornecedor fornecedor;
	private double preco;
	public Produto() {
	}
	public Produto(int id, String nome, String descricao, Caregoria categoria, Fornecedor fornecedor, double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Caregoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Caregoria categoria) {
		this.categoria = categoria;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
