package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.sysauto.dao.IUsuarioDAO;
import br.com.sysauto.model.Usuario;


public class MySQLUsuarioDAO implements IUsuarioDAO {
	Connection conexao;
	
	public MySQLUsuarioDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public boolean inserir(Usuario _usuario) {
		return false;
	}

	public boolean editar(Usuario _usuario){
		return false;
	}

	public List<Usuario> listarTodos() {
		return null;
	}

	public boolean excluir(String _cpfUsuario) {
		return false;
	}
}
