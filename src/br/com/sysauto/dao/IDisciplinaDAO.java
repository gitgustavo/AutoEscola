package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Disciplina;
import br.com.sysauto.util.exceptions.BDException;

public interface IDisciplinaDAO {
	public boolean inserir(Disciplina _disciplina) throws BDException;
	public boolean editar(Disciplina _disciplina) throws BDException;
	public List<Disciplina> listarTodos() throws BDException;
	public boolean excluir(String _idDisciplina) throws BDException;
}
