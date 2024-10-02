package br.com.loja.Assistec.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO extends GenericDAO{

	private Connection conexao = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	

	public LoginDAO() {
		
		conexao = br.com.loja.Assistec.dal.ConexaoBD.getConnection();
	}
	
	public Connection getConexao() {
		return this.conexao;
	}
	
	public Boolean bancoOnline() throws SQLException {
		return getConnection().isValid(0);
	}

	public Usuario autenticar(String login, String senha) throws SQLException {
		String sql = "SELECT * FROM usuarios WHERE login=? AND senha=?";
		Usuario usuario = null;
		PreparedStatement pstm = getConnection().prepareStatement(sql);
		pstm.setNString(1, login);
		pstm.setNString(2, senha);
		
		ResultSet rs = pstm.executeQuery();
		
		while(rs.next()) {
			usuario = new Usuario();
			usuario.setIduser(rs.getInt("iduser"));
			usuario.setNome(rs.getString("nome"));
			usuario.setFone(rs.getString("fone"));
			usuario.setLogin(rs.getString("login"));
			usuario.setSenha(rs.getString("senha"));
			usuario.setPerfil(rs.getString("perfil"));
			
		}
		rs.close();
		pstm.close();
		getConnection().close();
		
		return usuario;
				
	}
}
