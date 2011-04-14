package br.com.sysauto.negocio;

import java.util.List;

import br.com.sysauto.dao.memoria.FachadaDAOMemoria;
import br.com.sysauto.model.Aluno;

public class AlunoNegocio {

	
	public AlunoNegocio() {
		// TODO Auto-generated constructor stub
	}

	public boolean cadastrarAluno(Aluno _aluno) {
		// TODO Auto-generated method stub
		FachadaDAOMemoria fachadaDAOMemoria = FachadaDAOMemoria.getInstance();
		
		return fachadaDAOMemoria.cadastrarAluno(_aluno);
	}
	
	public boolean editarAluno(String _cpf){
		FachadaDAOMemoria fachadaDAOMemoria = FachadaDAOMemoria.getInstance();
		
		return fachadaDAOMemoria.editarAluno(_cpf);
	}

	public List<Aluno> listarAlunos() {
		FachadaDAOMemoria fachadaDAOMemoria = FachadaDAOMemoria.getInstance();
		
		return fachadaDAOMemoria.listarAlunos();
	}
	
}
