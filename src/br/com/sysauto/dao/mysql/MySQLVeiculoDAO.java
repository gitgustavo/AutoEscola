package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.sysauto.dao.IVeiculoDAO;
import br.com.sysauto.model.Veiculo;


public class MySQLVeiculoDAO implements IVeiculoDAO {
	Connection conexao;
	
	public MySQLVeiculoDAO(Connection conexao) {
		this.conexao = conexao;
	}
	
	public boolean inserir(Veiculo _veiculo) {
		boolean retorno = false;
		
		String comando = "insert into veiculo (placa, cor, tipo, descricao)"+
		"values(?,?,?,?,?,?,?,?,?,?,?,?)";
	
		try {
			PreparedStatement p = this.conexao.prepareStatement(comando);
			
			p.setString(1, _veiculo.getPlaca());
			p.setString(2, _veiculo.getCor());
			p.setString(3, _veiculo.getTipo());
			p.setString(4, _veiculo.getDescricao());
	
			p.execute();
			
			retorno = true;
		} catch (SQLException e) {
			System.out.println("Ocorreu erro na hora de inserir a Veiculo try catch");
			e.printStackTrace();
		}
		
		return retorno;
	}

	public boolean editar(Veiculo _veiculo){
		return false;
	}

	public List<Veiculo> listarTodos() {
		return null;
	}

	public boolean excluir(String _placaVeiculo) {
		return false;
	}
}
