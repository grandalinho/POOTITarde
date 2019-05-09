package br.com.janelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.loja.Caregoria;
import com.loja.Fornecedor;
import com.loja.Produto;

public class GerenciarProdutos extends JFrame{
	
	//Elementos para a categoria
	static JLabel lblIdCat = new JLabel("id Categoria");
	static JLabel lblNomeCat = new JLabel("Nome Categoria");
	static JLabel lblDescCat = new JLabel("Descrição");
	
	static JTextField txtIdCat = new JTextField();
	static JTextField txtNomeCat = new JTextField();
	static JTextField txtDescCat = new JTextField();
	
	static JButton btnCadCat = new JButton("Cadastrar Categoria");
	
	static JLabel lblIdFor = new JLabel("Id Fornecedor:");
	static JLabel lblRS = new JLabel("Razão Social:");
	static JLabel lblCnpj = new JLabel("CNPJ:");
	
	static JTextField txtIdFor = new JTextField();
	static JTextField txtRS = new JTextField();
	static JTextField txtCnpj = new JTextField();
	
	//Elementos para produtos
	static JLabel lblIdPr = new JLabel("id do Produto");
	static JLabel lblNomePr = new JLabel("Nome do Produto");
	static JLabel lblDescPr = new JLabel("Descrição do Produto");
	static JLabel lblCategoria = new JLabel("Selecione uma categoria:");
	static JLabel lblFornecedor = new JLabel("Selecione um Fornnecedor:");
	static JLabel lblPrecoPr = new JLabel("Preço do Produto:");
 	
	static JTextField txtIdPr = new JTextField();
	static JTextField txtNomePr = new JTextField();
	static JTextField txtDescPr = new JTextField();
	static JTextField txtCategoria = new JTextField();
	static JTextField txtFornecedor = new JTextField();
	static JTextField txtPrecoPr = new JTextField();
	
	static JButton btnCadPr = new JButton("Cadastrar Produto");
 	
 	
	
	static JButton btnCadFor = new JButton("Cadastrar Fornecedor");
	
	public static void main(String[] args) {
		JFrame gerenciar = new JFrame();
		gerenciar.setTitle("Gerenciar Produtos"); //nome do programa
		gerenciar.setSize(600,600); //tamanho
		gerenciar.setLocationRelativeTo(null); //centralizar a tela
		gerenciar.setDefaultCloseOperation(EXIT_ON_CLOSE); //limpar memoria ao fechar
		gerenciar.setResizable(false); //lockar o tamanho da janela
		//Definir o gerenciamento do layout como absoluto, ou seja, nulo
		gerenciar.getContentPane().setLayout(null);
		
		lblIdCat.setBounds(10,10,150,30);
		gerenciar.add(lblIdCat);
		
		txtIdCat.setBounds(10, 45, 100, 30);
		gerenciar.add(txtIdCat);
		
		lblNomeCat.setBounds(10,75,150,30);
		gerenciar.add(lblNomeCat);
		
		txtNomeCat.setBounds(10, 105, 100, 30);
		gerenciar.add(txtNomeCat);
		
		lblDescCat.setBounds(10,135,100,30);
		gerenciar.add(lblDescCat);
		
		txtDescCat.setBounds(10,165,200,30);
		gerenciar.add(txtDescCat);
		
		btnCadCat.setBounds(10,205,200,30);
		gerenciar.add(btnCadCat);
		
		lblIdFor.setBounds(10,235,200,30);
		gerenciar.add(lblIdFor);
		
		txtIdFor.setBounds(10, 265, 100, 30);
		gerenciar.add(txtIdFor);
		
		lblRS.setBounds(10,295,200,30);
		gerenciar.add(lblRS);
		
		txtRS.setBounds(10, 325, 200, 30);
		gerenciar.add(txtRS);
		
		lblCnpj.setBounds(10, 355, 200, 30);
		gerenciar.add(lblCnpj);
		
		txtCnpj.setBounds(10, 385, 200, 30);
		gerenciar.add(txtCnpj);
		
		btnCadFor.setBounds(10, 425, 200, 30);
		gerenciar.add(btnCadFor);
		
		lblIdPr.setBounds(230, 10, 200, 30);
		gerenciar.add(lblIdPr);
		
		txtIdPr.setBounds(230, 45, 200, 30);
		gerenciar.add(txtIdPr);
		
		lblNomePr.setBounds(230, 75, 200, 30);
		gerenciar.add(lblNomePr);
		
		txtNomePr.setBounds(230, 105, 200, 30);
		gerenciar.add(txtNomePr);
		
		lblDescPr.setBounds(230, 135, 200, 30);
		gerenciar.add(lblDescPr);
		
		txtDescPr.setBounds(230, 165, 340, 130);
		gerenciar.add(txtDescPr);
		
		lblCategoria.setBounds(230, 295, 200, 30);
		gerenciar.add(lblCategoria);
		
		txtCategoria.setBounds(230, 325, 340, 30);
		gerenciar.add(txtCategoria);
		
		lblFornecedor.setBounds(230, 355, 200, 30);
		gerenciar.add(lblFornecedor);
		
		txtFornecedor.setBounds(230, 385, 200, 30);
		gerenciar.add(txtFornecedor);
		
		lblPrecoPr.setBounds(230, 415, 200, 30);
		gerenciar.add(lblPrecoPr);
		
		txtPrecoPr.setBounds(230, 445, 200, 30);
		gerenciar.add(txtPrecoPr);
		
		btnCadPr.setBounds(230, 485, 200, 30);
		gerenciar.add(btnCadPr);
		
		//############# desabilitar os controles textfield do
		//############# fornecedor e produtos
		//#############
		
		txtIdFor.setEnabled(false);
		txtRS.setEnabled(false);
		txtCnpj.setEnabled(false);
		btnCadFor.setEnabled(false);
		
		txtIdPr.setEnabled(false);
		txtNomePr.setEnabled(false);
		txtDescPr.setEnabled(false);
		txtFornecedor.setEnabled(false);
		txtCategoria.setEnabled(false);
		txtPrecoPr.setEnabled(false);
		btnCadPr.setEnabled(false);
		
		//-------- vamos criar o objeto categoria e 
		//-------- passar os dados do formulario para o objeto criado
		Caregoria cat = new Caregoria();
		
		//-------- vamos fazer a passagem dos dados para o objeto
		//-------- no momento em que clicarmos no botão
		
		btnCadCat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cat.setId(Integer.parseInt(txtIdCat.getText()));
				cat.setNome(txtNomeCat.getText());
				cat.setNome(txtDescCat.getText());
				
				//------desabilitar as caixas da categoria
				txtIdCat.setEnabled(false);
				txtNomeCat.setEnabled(false);
				txtDescCat.setEnabled(false);
				btnCadCat.setEnabled(false);
				//----------habilitar as caixas do fornecedor
				txtIdFor.setEnabled(true);
				txtRS.setEnabled(true);
				txtCnpj.setEnabled(true);
				btnCadFor.setEnabled(true);
				
				
			}
		});
		
		
		
		
		//---- vamos instanciar a classe fornecedor e passar 
		//---- os dados para o objeto no momento em que
		//---- o botão cadastro for clicado
		Fornecedor f = new Fornecedor();
		
		btnCadFor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f.setId(Integer.parseInt(txtIdFor.getText()));
				f.setRazaoSocial(txtRS.getText());
				f.setCnpj(txtCnpj.getText());
				
				//----------habilitar as caixas do fornecedor
				txtIdFor.setEnabled(false);
				txtRS.setEnabled(false);
				txtCnpj.setEnabled(false);
				btnCadFor.setEnabled(false);
				//------ habilitar os controles produto
				txtIdPr.setEnabled(true);
				txtNomePr.setEnabled(true);
				txtDescPr.setEnabled(true);
				txtFornecedor.setEnabled(true);
				txtCategoria.setEnabled(true);
				txtPrecoPr.setEnabled(true);
				btnCadPr.setEnabled(true);
				
			}
		});
		
		//-------- vamos criar um objeto baseado em
		//-------- produtos para passar os dados no momento do clique
		//-------- botão cadastro
		
		Produto pr = new Produto();
		btnCadPr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			pr.setId(Integer.parseInt(txtIdPr.getText()));
			pr.setNome(txtNomePr.getText());
			pr.setDescricao(txtDescPr.getText());
			pr.setCategoria(cat);
			pr.setFornecedor(f);
			pr.setPreco(Double.parseDouble(txtPrecoPr.getText()));
			
			//----- desabilitar os controles de produto
			txtIdPr.setEnabled(false);
			txtNomePr.setEnabled(false);
			txtDescPr.setEnabled(false);
			txtFornecedor.setEnabled(false);
			txtCategoria.setEnabled(false);
			txtPrecoPr.setEnabled(false);
			btnCadPr.setEnabled(false);
			
			//---- caixa de confirmação
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
			
			//----habilitar categorias
			txtIdCat.setEnabled(true);
			txtNomeCat.setEnabled(true);
			txtDescCat.setEnabled(true);
			btnCadCat.setEnabled(true);
			
			
			
			}
		});
		
		
	
		
		gerenciar.setVisible(true);

	}

}
