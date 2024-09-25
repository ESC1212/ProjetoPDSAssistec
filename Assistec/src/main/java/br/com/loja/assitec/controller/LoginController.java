package br.com.loja.assitec.controller;

import br.com.loja.assitec.model.UsuarioModel;
import br.com.loja.asssistec.view.LoginView;

public class LoginController {
	public LoginController(LoginView view) {
		this.view = view;
		this.model = new UsuarioModel();
		
		if(model.conexao != null) {
			view.Status.setText("Conectado ao bando de dados");
		}
		this.view.btnLoin.addActionListener(e -> logar());
	}
	public void logar() {
		String login = view.textFieldUsuario.getText();
		String senha = new String(view.passwordFieldSenha.getPassword());
		String perfil= model.autenticar(login, senha);
	}

}
