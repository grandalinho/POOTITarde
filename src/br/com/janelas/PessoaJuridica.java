package br.com.janelas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PessoaJuridica extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PessoaJuridica frame = new PessoaJuridica();
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
	public PessoaJuridica() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 374, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setBounds(10, 11, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Razao Social:");
		lblNewLabel_1.setBounds(10, 36, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(10, 61, 48, 14);
		contentPane.add(lblEmail);
		
		JLabel lblNewLabel_2 = new JLabel("Cnpj:");
		lblNewLabel_2.setBounds(10, 86, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNomeFantasia = new JLabel("Nome Fantasia:");
		lblNomeFantasia.setBounds(10, 111, 90, 14);
		contentPane.add(lblNomeFantasia);
		
		JLabel lblNewLabel_3 = new JLabel("Endere\u00E7o:");
		lblNewLabel_3.setBounds(10, 136, 67, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Telefone:");
		lblNewLabel_4.setBounds(10, 161, 67, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(142, 108, 164, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(142, 83, 164, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(142, 58, 164, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(142, 33, 164, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(142, 8, 48, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(142, 133, 164, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(142, 158, 164, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		com.poo.heranca.PessoaJuridica pj = new com.poo.heranca.PessoaJuridica();
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pj.cadastrar();
			}
		});
		btnCadastrar.setBounds(10, 209, 110, 23);
		contentPane.add(btnCadastrar);
	}

}
