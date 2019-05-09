package br.com.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;

public class Inicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicial frame = new Inicial();
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
	public Inicial() {
		setResizable(false);
		setTitle("EscolherConta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 180);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Pessoa Fisica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PessoaFisica pf = new PessoaFisica();
				pf.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(28, 66, 138, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pessoa Juridica");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PessoaJuridica pj = new PessoaJuridica();
				pj.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(261, 66, 138, 30);
		contentPane.add(btnNewButton_1);
	}
}
