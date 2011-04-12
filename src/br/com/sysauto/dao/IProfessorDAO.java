package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Professor;
import br.com.sysauto.util.exceptions.BDException;

public interface IProfessorDAO {
	public boolean inserir(Professor _professor) throws BDException;
	public boolean editar(Professor _professor) throws BDException;
	public List<Professor> listarTodos() throws BDException;
	public boolean excluir(String _cpfProfessor) throws BDException;
}
