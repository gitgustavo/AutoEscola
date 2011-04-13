package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;

import br.com.sysauto.model.Veiculo;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaVeiculoDAO {

	private static MemoriaVeiculoDAO singleton = null;
	private List<Veiculo> veiculos;
	
	private MemoriaVeiculoDAO() {
		// TODO Auto-generated constructor stub
		this.veiculos = new Vector<Veiculo> (); 
	}

	public static MemoriaVeiculoDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaVeiculoDAO ();
		}
		return singleton;
	}

	public boolean inserir(Veiculo _veiculo) throws BDException {
		// TODO Auto-generated method stub
		return this.veiculos.add(_veiculo);
	}

	public boolean editar(Veiculo _veiculo) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.veiculos.indexOf(_veiculo);
		boolean result = false;
		if (idx != -1) {
			this.veiculos.add(idx, _veiculo);
			result = true;
		}
		return result;
	}


	public List<Veiculo> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return veiculos;
	}

	public boolean excluir(String _placaVeiculo) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_placaVeiculo);
		boolean result = false;
		if (idx != -1) {
			this.veiculos.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _placaVeiculo) throws BDException {
		int result = -1;
		for (int i = 0; i < this.veiculos.size() ; i++) {
			if (this.veiculos.get(i).getPlaca().equals(_placaVeiculo)) {
				result = i;
				i = this.veiculos.size();
			}
		}
		return result;
	}

}
