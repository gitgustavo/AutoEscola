package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Aluno;
import br.com.sysauto.util.exceptions.BDException;

public interface IAlunoDAO {
	public boolean inserir(Aluno _aluno) throws BDException;
	public boolean editar(Aluno _aluno) throws BDException;
	public List<Aluno> listarTodos() throws BDException;
	public boolean excluir(String _cpfAluno) throws BDException;
}
