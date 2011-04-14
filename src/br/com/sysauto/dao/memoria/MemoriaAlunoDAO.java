package br.com.sysauto.dao.memoria;

import java.util.ArrayList;
import java.util.List;


import br.com.sysauto.model.Aluno;
import br.com.sysauto.util.exceptions.BDException;


public class MemoriaAlunoDAO{


	private List<Aluno> alunos;
	
	private static MemoriaAlunoDAO singleton = null;

	
	private MemoriaAlunoDAO () {
		this.alunos = new ArrayList<Aluno>();
	}
	
	public static MemoriaAlunoDAO getInstance() {
		if (singleton == null) {
			singleton = new MemoriaAlunoDAO ();
		}
		return singleton;
	}
	
	public boolean inserir(Aluno _aluno){
		// TODO Auto-generated method stub
		System.out.println("Aluno inserido com sucesso! e size: "+ this.alunos.size());
		
		return this.alunos.add(_aluno);
	}


	public boolean editar(String _cpf) {
		// TODO Auto-generated method stub
		for(int i=0; i<this.alunos.size();i++){
			if(_cpf.equalsIgnoreCase(this.alunos.get(i).getCpf())){
				
			}
		}
		return result;
	}


	public List<Aluno> listarTodos(){
		
		for(int i=0; i<this.alunos.size();i++){
			System.out.println(this.alunos.get(i).getNome());
		}
		return alunos;
	}


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
