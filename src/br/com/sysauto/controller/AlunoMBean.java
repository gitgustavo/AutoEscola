package br.com.sysauto.controller;

import java.util.List;

import br.com.sysauto.model.Aluno;
import br.com.sysauto.negocio.FachadaNegocio;
import br.com.sysauto.util.exceptions.BDException;
import br.com.sysauto.util.exceptions.BusinessException;

public class AlunoMBean {
	private Aluno aluno;
	private List<Aluno> alunos;

	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public List<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public String actionCadastroAluno () {
		boolean validate = false;
		try {
			FachadaNegocio negocio = FachadaNegocio.getInstance();
			validate = negocio.cadastrarAluno(this.aluno);
			
		} catch (BDException bd) {
			// Tratar as exceções da camada DAO
		} catch (BusinessException b) {
			// Tratar as exceções da camada de negocio
		}
		
		if (validate) {
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}
	
	
}
