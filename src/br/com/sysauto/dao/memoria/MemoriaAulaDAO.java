package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;

import br.com.sysauto.model.Aula;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaAulaDAO {

	private static MemoriaAulaDAO singleton = null;
	private List<Aula> aulas;
	
	private MemoriaAulaDAO() {
		// TODO Auto-generated constructor stub
		this.aulas = new Vector<Aula> (); 
	}

	public static MemoriaAulaDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaAulaDAO ();
		}
		return singleton;
	}

	public boolean inserir(Aula _aula) throws BDException {
		// TODO Auto-generated method stub
		return this.aulas.add(_aula);
	}


	public boolean editar(Aula _aula) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.aulas.indexOf(_aula);
		boolean result = false;
		if (idx != -1) {
			this.aulas.add(idx, _aula);
			result = true;
		}
		return result;
	}


	public List<Aula> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return aulas;
	}

	public boolean excluir(String _idAula) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_idAula);
		boolean result = false;
		if (idx != -1) {
			this.aulas.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _idAula) throws BDException {
		int result = -1;
		for (int i = 0; i < this.aulas.size() ; i++) {
			if (String.valueOf(this.aulas.get(i).getIdAula()).equals(_idAula)) {
				result = i;
				i = this.aulas.size();
			}
		}
		return result;
	}


}
