package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;

import br.com.sysauto.dao.IDisciplinaDAO;
import br.com.sysauto.model.Disciplina;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaDisciplinaDAO implements IDisciplinaDAO {

	private static MemoriaDisciplinaDAO singleton = null;
	private List<Disciplina> disciplinas;
	
	private MemoriaDisciplinaDAO() {
		// TODO Auto-generated constructor stub
		this.disciplinas = new Vector<Disciplina> (); 
	}

	public static MemoriaDisciplinaDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaDisciplinaDAO ();
		}
		return singleton;
	}
	
	@Override
	public boolean inserir(Disciplina _disciplina) throws BDException {
		// TODO Auto-generated method stub
		return this.disciplinas.add(_disciplina);
	}

	@Override
	public boolean editar(Disciplina _disciplina) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.disciplinas.indexOf(_disciplina);
		boolean result = false;
		if (idx != -1) {
			this.disciplinas.add(idx, _disciplina);
			result = true;
		}
		return result;
	}

	@Override
	public List<Disciplina> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return disciplinas;
	}

	@Override
	public boolean excluir(String _idDisciplina) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_idDisciplina);
		boolean result = false;
		if (idx != -1) {
			this.disciplinas.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _idDisciplina) throws BDException {
		int result = -1;
		for (int i = 0; i < this.disciplinas.size() ; i++) {
			if (String.valueOf(this.disciplinas.get(i).getIdDisciplina()).equals(_idDisciplina)) {
				result = i;
				i = this.disciplinas.size();
			}
		}
		return result;
	}


}
