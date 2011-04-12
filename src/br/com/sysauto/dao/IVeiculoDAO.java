package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Veiculo;
import br.com.sysauto.util.exceptions.BDException;

public interface IVeiculoDAO {
	public boolean inserir(Veiculo _veiculo) throws BDException;
	public boolean editar(Veiculo _veiculo) throws BDException;
	public List<Veiculo> listarTodos() throws BDException;
	public boolean excluir(String _placaVeiculo) throws BDException; 
}
