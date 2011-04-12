package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.sysauto.dao.IAulaDAO;
import br.com.sysauto.model.Aula;


public class MySQLAulaDAO implements IAulaDAO {
	Connection conexao;
	
	public MySQLAulaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public boolean inserir(Aula _aula) {
		return false;
	}

	public boolean editar(Aula _aula){
		return false;	
	}

	public List<Aula> listarTodos() {
		return null;
	}

	public boolean excluir(String _idAula) {
		return false;
	}
}
