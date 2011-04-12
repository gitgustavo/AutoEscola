package br.com.sysauto.dao.mysql;

import java.sql.Connection;

import br.com.sysauto.dao.DAOFactory;
import br.com.sysauto.dao.IAlunoDAO;
import br.com.sysauto.dao.IAulaDAO;
import br.com.sysauto.dao.IDisciplinaDAO;
import br.com.sysauto.dao.IProfessorDAO;
import br.com.sysauto.dao.IUsuarioDAO;
import br.com.sysauto.dao.IVeiculoDAO;
import br.com.sysauto.util.exceptions.BDException;

public class MyQSLDAOFactory extends DAOFactory {
	
	public static final String DRIVER = "org.gjt.mm.mysql.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/sysauto";
	
	private java.sql.Connection conexao;
	
	public java.sql.Connection openConexao(){
		try{
			
			Class.forName(DRIVER);
			conexao = java.sql.DriverManager.getConnection(DBURL, "root", "214605");
			
		}catch (Exception e) {
			System.out.println("essa budega nao conectou!!!!");
		}
		
		return conexao;
	}
	
	public void closeConexao(){
		try {
			conexao.close();
		} catch (Exception e) {
			System.out.println("Erro na classe ConexaoBanco ao se conectar com o banco de dados!");
		}
	}
	
	@Override
	public IAlunoDAO getAlunoDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLAlunoDAO(conexao);
	}

	@Override
	public IAulaDAO getAulaDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLAulaDAO(conexao);
	}

	@Override
	public IDisciplinaDAO getDisciplinaDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLDisciplinaDAO(conexao);
	}

	@Override
	public IProfessorDAO getProfessorDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLProfessorDAO(conexao);
	}

	@Override
	public IUsuarioDAO getUsuarioDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLUsuarioDAO(conexao);
	}

	@Override
	public IVeiculoDAO getVeiculoDAO(Connection conexao) throws BDException {
		// TODO Auto-generated method stub
		return new MySQLVeiculoDAO(conexao);
	}

}
