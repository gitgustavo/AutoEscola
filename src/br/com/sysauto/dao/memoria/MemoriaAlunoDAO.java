package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;

import br.com.sysauto.dao.IAlunoDAO;
import br.com.sysauto.model.Aluno;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaAlunoDAO implements IAlunoDAO {

	private static MemoriaAlunoDAO singleton = null;
	private List<Aluno> alunos;
	
	private MemoriaAlunoDAO() {
		// TODO Auto-generated constructor stub
		this.alunos = new Vector<Aluno> (); 
	}

	public static MemoriaAlunoDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaAlunoDAO ();
		}
		return singleton;
	}
	
	@Override
	public boolean inserir(Aluno _aluno) throws BDException {
		// TODO Auto-generated method stub
		System.out.println("Aluno inserido com sucesso!");
		return this.alunos.add(_aluno);
	}

	@Override
	public boolean editar(Aluno _aluno) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.alunos.indexOf(_aluno);
		boolean result = false;
		if (idx != -1) {
			this.alunos.add(idx, _aluno);
			result = true;
		}
		return result;
	}

	@Override
	public List<Aluno> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return alunos;
	}

	@Override
	public boolean excluir(String _cpfAluno) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_cpfAluno);
		boolean result = false;
		if (idx != -1) {
			this.alunos.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _cpfAluno) throws BDException {
		int result = -1;
		for (int i = 0; i < this.alunos.size() ; i++) {
			if (this.alunos.get(i).getCpf().equals(_cpfAluno)) {
				result = i;
				i = this.alunos.size();
			}
		}
		return result;
	}

}
