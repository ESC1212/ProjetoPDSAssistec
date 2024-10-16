package br.com.loja.Assistec.controle;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.loja.Assistec.model.LoginDAO;
import br.com.loja.Assistec.model.Usuario;

public class LoginController {

	public LoginController() {
		
	}
	public Boolean verificarBancoOnline() throws SQLException {
		LoginDAO dao = new LoginDAO();
		return dao.bancoOnline();
		
	}
	
	public ArrayList<String> autenticar(String login, String senha) throws SQLException{
		ArrayList<String> listaDados = new ArrayList<>();
		LoginDAO dao = new LoginDAO();
		Usuario user = dao.autenticar(login, senha);
		listaDados.add(0, user.getNome());
		listaDados.add(1, user.getPerfil());
		
		return listaDados;
	}
	
}
