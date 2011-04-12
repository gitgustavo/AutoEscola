package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.util.List;

import br.com.sysauto.dao.IDisciplinaDAO;
import br.com.sysauto.model.Disciplina;


public class MySQLDisciplinaDAO implements IDisciplinaDAO{
	Connection conexao;
	
	public MySQLDisciplinaDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public boolean inserir(Disciplina _disciplina) {
		return false;
	}

	public boolean editar(Disciplina _disciplina){
		return false;
	}

	public List<Disciplina> listarTodos() {
		return null;
	}

	public boolean excluir(String _idDisciplina) {
		return false;
	}
}
