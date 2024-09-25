package br.com.loja.assitec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import dev.com.loja.Assistec.dal.ModuloConexao;

public class UsuarioModel {
	public Connection conexao = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	private UsuarioModel() {
		conexao = ModuloConexao.conector();
	}
	public String autenticar(String login, String senha) {
		String sql = "SELECT * FROM usuarios WHERE login=? AND senha=?";
		try {
			pst = conexao.prepareStatement(sql);
			pst.setString(1, login);
			pst.setString(2, senha);
			
			rs = pst.executeQuery();
			
			if (rs.next()) {
				String perfil = rs.getString(0);
				return null;
			} else {
				return null;
			}
			
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		try {
			conexao.close();
		} catch (SQLExeption e)
	}

}
