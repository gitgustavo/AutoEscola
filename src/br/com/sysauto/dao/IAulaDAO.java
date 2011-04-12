package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Aula;
import br.com.sysauto.util.exceptions.BDException;

public interface IAulaDAO {
	public boolean inserir(Aula _aula) throws BDException;
	public boolean editar(Aula _aula) throws BDException;
	public List<Aula> listarTodos() throws BDException;
	public boolean excluir(String _idAula) throws BDException;
}
