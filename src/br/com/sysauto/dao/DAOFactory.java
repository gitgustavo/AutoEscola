package br.com.sysauto.dao;

import java.sql.Connection;

import br.com.sysauto.dao.memoria.MemoriaDAOFactory;
import br.com.sysauto.dao.mysql.MyQSLDAOFactory;
import br.com.sysauto.util.exceptions.BDException;

public abstract class DAOFactory {
	// List of DAO types supported by the factory
	  public static final int MYSQL = 1;
	  public static final int MEMORIA = 2;
	  
	  // There will be a method for each DAO that can be 
	  // created. The concrete factories will have to 
	  // implement these methods.
	  public abstract void closeConexao() throws BDException;
	  public abstract Connection openConexao() throws BDException;
	  public abstract IAlunoDAO getAlunoDAO(Connection conexao) throws BDException;
	  public abstract IAulaDAO getAulaDAO(Connection conexao) throws BDException;
	  public abstract IDisciplinaDAO getDisciplinaDAO(Connection conexao) throws BDException;
	  public abstract IProfessorDAO getProfessorDAO(Connection conexao) throws BDException;
	  public abstract IUsuarioDAO getUsuarioDAO(Connection conexao) throws BDException;
	  public abstract IVeiculoDAO getVeiculoDAO(Connection conexao) throws BDException;

	  public static DAOFactory getDAOFactory(int whichFactory)  throws BDException {
	  
	    switch (whichFactory) {
	      case MYSQL: 
	          return new MyQSLDAOFactory();
	      case MEMORIA    : 
	          return new MemoriaDAOFactory();      
	      default           : 
	          return null;
	    }
	  }
	

}
