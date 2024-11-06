package br.com.loja.Assistec.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalView extends JFrame {
	
	private JMenuItem menuSobre;
	private JPanel contentPane;
	private JMenu menuAjuda;
	private JMenu menuRelatorio;
	private JMenu menuArquivo;
	private JMenuItem menuSair;
	private JMenu menuCadastro;
	private JMenuItem menuUsuario;
	private JLabel lbluser;
	
	public JMenuItem setMenuSobre() {
		return menuSobre;
	}
	public JMenuItem setMenuSair() {
		return menuSair;
	}
	public JMenuItem setMenuUsuario(){
		return menuUsuario;
	}
	public JLabel setLbluser() {
		return lbluser;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalView frame = new PrincipalView(null,null);
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
	public PrincipalView(String user, String perfil) {
		perfil = "O omi";
		user = "jesus";
		
		setTitle("Assistec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		menuSair = new JMenuItem("Sair");
		menuArquivo.add(menuSair);
		
		menuCadastro = new JMenu("Cadastro");
		menuCadastro.setEnabled(false);
		menuBar.add(menuCadastro);
		
		menuUsuario = new JMenuItem("Usuários");
		menuCadastro.add(menuUsuario);
		
		menuRelatorio = new JMenu("Relatório");
		menuRelatorio.setEnabled(false);
		menuBar.add(menuRelatorio);
		
		menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);
		
		menuSobre = new JMenuItem("Sobre");
		
		menuAjuda.add(menuSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		lbluser = new JLabel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbluser)
					.addContainerGap(368, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(204, Short.MAX_VALUE)
					.addComponent(lbluser)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);

			if(perfil.equalsIgnoreCase("admin")) {
				menuCadastro.setEnabled(true);
				menuRelatorio.setEnabled(true);
			}
	}	
}
