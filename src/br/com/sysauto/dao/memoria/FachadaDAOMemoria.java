package br.com.sysauto.dao.memoria;

import java.util.List;

import br.com.sysauto.model.Aluno;


public class FachadaDAOMemoria {
	private static FachadaDAOMemoria singleton = null;
	
	private FachadaDAOMemoria () {
		
	}
	
	public static FachadaDAOMemoria getInstance() {
		if (singleton == null) {
			singleton = new FachadaDAOMemoria ();
		}
		return singleton;
	}
	
	public boolean cadastrarAluno(Aluno _aluno){

		MemoriaAlunoDAO alunoDAOMemoria = MemoriaAlunoDAO.getInstance();
		
		
		return alunoDAOMemoria.inserir(_aluno);
	}

	public List<Aluno> listarAlunos() {
		MemoriaAlunoDAO alunoDAOMemoria = MemoriaAlunoDAO.getInstance();
		List<Aluno>  alunos = alunoDAOMemoria.listarTodos();
		return alunos;
	}

	public boolean editarAluno(String _cpf) {
		MemoriaAlunoDAO alunoDAOMemoria = MemoriaAlunoDAO.getInstance();
		
		return alunoDAOMemoria.editar(_cpf);
	}
	
}
