package br.com.sysauto.dao.memoria;

import java.sql.Connection;

import br.com.sysauto.dao.DAOFactory;
import br.com.sysauto.dao.IAlunoDAO;
import br.com.sysauto.dao.IAulaDAO;
import br.com.sysauto.dao.IDisciplinaDAO;
import br.com.sysauto.dao.IProfessorDAO;
import br.com.sysauto.dao.IUsuarioDAO;
import br.com.sysauto.dao.IVeiculoDAO;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaDAOFactory extends DAOFactory {
	
	@Override
	public IAlunoDAO getAlunoDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaAlunoDAO.getInstance();
	}

	@Override
	public IAulaDAO getAulaDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaAulaDAO.getInstance();
	}

	@Override
	public IDisciplinaDAO getDisciplinaDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaDisciplinaDAO.getInstance();
	}

	@Override
	public IProfessorDAO getProfessorDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaProfessorDAO.getInstance();
	}

	@Override
	public IUsuarioDAO getUsuarioDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaUsuarioDAO.getInstance();
	}

	@Override
	public IVeiculoDAO getVeiculoDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return MemoriaVeiculoDAO.getInstance();
	}

	@Override
	public void closeConexao() throws BDException {
		// TODO Auto-generated method stub
	}

	@Override
	public Connection openConexao() throws BDException {
		// TODO Auto-generated method stub
		return null;
	}



}
