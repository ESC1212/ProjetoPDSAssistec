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

	private JPanel contentPane;

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
		setTitle("Assistec");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem menuSair = new JMenuItem("Sair");
		menuSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sair();
			}
		});
		menuArquivo.add(menuSair);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setEnabled(false);
		menuBar.add(menuCadastro);
		
		JMenuItem menuUsuario = new JMenuItem("Usuários");
		menuCadastro.add(menuUsuario);
		
		JMenu menuRelatorio = new JMenu("Relatório");
		menuRelatorio.setEnabled(false);
		menuBar.add(menuRelatorio);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		menuBar.add(menuAjuda);
		
		JMenuItem menuSobre = new JMenuItem("Sobre");
		menuSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(menuSobre, "Assistec verção 0.2");
			}
		});
		menuAjuda.add(menuSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lbluser = new JLabel(user);
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
	private void Sair() {
		int sair = JOptionPane.showConfirmDialog(null, "Você deseja Sair?","sair",JOptionPane.YES_NO_OPTION);
		if(sair == 0) {
			System.exit(0);
		}
	}
	
}
