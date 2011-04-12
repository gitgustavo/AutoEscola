package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.sysauto.dao.IProfessorDAO;
import br.com.sysauto.model.Professor;


public class MySQLProfessorDAO implements IProfessorDAO {
	Connection conexao;
	
	public MySQLProfessorDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public boolean inserir(Professor _professor) {
		return false;
	}

	public boolean editar(Professor _professor){
		return false;
	}

	public List<Professor> listarTodos() {
		return null;
	}

	public boolean excluir(String _cpfProfessor) {
		return false;
	}
}
