package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PessoaFisica extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtEndereco;
	private JTextField txtTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PessoaFisica frame = new PessoaFisica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PessoaFisica() {
		setResizable(false);
		setTitle("Pessoa Fisica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 290, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Id:");
		lblNome.setBounds(10, 25, 47, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Nome:");
		lblEmail.setBounds(10, 50, 47, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEmail_1 = new JLabel("E-mail:");
		lblEmail_1.setBounds(10, 75, 47, 14);
		contentPane.add(lblEmail_1);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(10, 100, 47, 14);
		contentPane.add(lblCpf);
		
		JLabel lblRg = new JLabel("Rg:");
		lblRg.setBounds(10, 125, 47, 14);
		contentPane.add(lblRg);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 150, 60, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(9, 175, 48, 14);
		contentPane.add(lblTelefone);
		
		txtId = new JTextField();
		txtId.setBounds(67, 22, 47, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(67, 47, 143, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(67, 72, 143, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(67, 97, 143, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		txtRg = new JTextField();
		txtRg.setBounds(67, 122, 143, 20);
		contentPane.add(txtRg);
		txtRg.setColumns(10);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(77, 147, 143, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(67, 175, 143, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		com.poo.heranca.PessoaFisica pf = new com.poo.heranca.PessoaFisica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pf.setId(Integer.parseInt(txtId.getText()));
				pf.setNome(txtNome.getText());
				pf.setEmail(txtEmail.getText());
				pf.setTelefone(txtTelefone.getText());
				pf.setEndereco(txtEndereco.getText());
				pf.setCpf(txtCpf.getText());
				pf.setRg(txtRg.getText());
				
				pf.cadastrar();
				
				JOptionPane.showMessageDialog(null,"Cadastrou!");
			}
		});
		btnCadastrar.setBounds(10, 206, 104, 23);
		contentPane.add(btnCadastrar);
	}
}
