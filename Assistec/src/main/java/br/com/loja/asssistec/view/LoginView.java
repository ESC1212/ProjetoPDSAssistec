package br.com.loja.asssistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	private JPanel contentPane;
	public JTextField textFieldUsuario;
	public JPasswordField passwordFieldSenha;
	public JButton btnLogin;
	public JLabel Status;
	
	
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow]", "[grow][grow][grow][grow][][grow][]"));
		
		JLabel lblNewLabel = new JLabel("Assistec");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel, "cell 0 0 2 1,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1, "cell 0 1 2 1,alignx center");
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		contentPane.add(lblNewLabel_3, "cell 0 2,alignx center");
		
		textFieldUsuario = new JTextField();
		contentPane.add(textFieldUsuario, "cell 1 2,growx");
		textFieldUsuario.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Senha");
		contentPane.add(lblNewLabel_4, "cell 0 3,alignx center");
		
		passwordFieldSenha = new JPasswordField();
		contentPane.add(passwordFieldSenha, "cell 1 3,growx");
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnLogin, "cell 0 5 2 1,growx");
		
		JLabel Status = new JLabel("");
		contentPane.add(Status, "cell 0 6");
	}

}
