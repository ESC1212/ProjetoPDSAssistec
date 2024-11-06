package br.com.loja.Assistec.controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import br.com.loja.Assistec.view.ListarUsuariosView;
import br.com.loja.Assistec.view.PrincipalView;

public class PrincipalControler {
	private PrincipalView telaP;
	ListarUsuariosView frame = new ListarUsuariosView();

	
	public PrincipalControler(String Nome, String Perfil) {
		telaP.setLbluser().setText(Perfil);
	}
	public void setPrincipalView(PrincipalView telaP) {
		this.telaP = telaP;
	}
	public void setSair(PrincipalView telaP) {
        this.telaP = telaP;
        telaP.setMenuSair().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 Sair();
            }
        });
    }
	protected void Sair() {
		int sair = JOptionPane.showConfirmDialog(null, "Você deseja Sair?","sair",JOptionPane.YES_NO_OPTION);
		if(sair == 0) {
			System.exit(0);
		}
	}
	protected void listarUsuarios() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
	public void setSobre (PrincipalView telaP) {
		this.telaP = telaP;
		telaP.setMenuSobre().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(telaP, "Assistec verção 0.3");
			}
		});
	}
	public void setLisarUsuarios(PrincipalView telaP) {
		this.telaP = telaP;
		telaP.setMenuUsuario().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				listarUsuarios();
			}
		});
	}
}
