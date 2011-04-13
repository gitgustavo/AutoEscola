package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;


import br.com.sysauto.model.Professor;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaProfessorDAO {

	private static MemoriaProfessorDAO singleton = null;
	private List<Professor> professores;
	
	private MemoriaProfessorDAO() {
		// TODO Auto-generated constructor stub
		this.professores = new Vector<Professor> (); 
	}

	public static MemoriaProfessorDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaProfessorDAO ();
		}
		return singleton;
	}

	public boolean inserir(Professor _professore) throws BDException {
		// TODO Auto-generated method stub
		return this.professores.add(_professore);
	}

	public boolean editar(Professor _professore) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.professores.indexOf(_professore);
		boolean result = false;
		if (idx != -1) {
			this.professores.add(idx, _professore);
			result = true;
		}
		return result;
	}
	
	public List<Professor> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return professores;
	}


	public boolean excluir(String _cpfProfessor) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_cpfProfessor);
		boolean result = false;
		if (idx != -1) {
			this.professores.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _cpfProfessor) throws BDException {
		int result = -1;
		for (int i = 0; i < this.professores.size() ; i++) {
			if (this.professores.get(i).getCpf().equals(_cpfProfessor)) {
				result = i;
				i = this.professores.size();
			}
		}
		return result;
	}


}
