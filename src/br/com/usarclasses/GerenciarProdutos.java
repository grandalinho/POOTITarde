package br.com.usarclasses;

import com.loja.Caregoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos {
	
	public static void main(String[] args) {
	/*
	 * vamos criar um vetor(Array|Coleção) de categorias
	 * 
	 * 
	 */
	
	Caregoria[] cat = {
					new Caregoria(11,"Informatica","Tecnologia"),
					new Caregoria(12,"Suprimentos","Diversos"),
					new Caregoria(13,"Escolar","Para o Estudo")
					};
		
		Fornecedor[] fornecedor = {
				
				new Fornecedor(51,"Microsoft","1111"),
				new Fornecedor(52,"Logitec","556"),
				new Fornecedor(53,"Tilibra","55487")
				};
		
		Produto pr = new Produto();
		pr.setId(60);
		pr.setNome("Mouse");
		pr.setDescricao("Mouse sem fio");
		pr.setCategoria(cat[0]);
		pr.setFornecedor(fornecedor[0]);
		pr.setPreco(20);
		}

}