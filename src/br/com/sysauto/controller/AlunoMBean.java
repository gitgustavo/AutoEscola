package br.com.sysauto.controller;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.faces.component.UIParameter;

import br.com.sysauto.model.Aluno;
import br.com.sysauto.negocio.FachadaNegocio;
import br.com.sysauto.util.exceptions.BDException;
import br.com.sysauto.util.exceptions.BusinessException;

public class AlunoMBean {
	private Aluno aluno = new Aluno();
	private String cpf = "";
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	private List<Aluno> alunos;

	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public List<Aluno> getAlunos() {
		return this.alunos;
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
			this.actionListarAlunos();
			return "SUCCESS";
		} else {
			return "FAILURE";
		}
	}
	
	public void actionListarAlunos(){
		FachadaNegocio negocio = FachadaNegocio.getInstance();
		this.setAlunos(negocio.listarAlunos());
	}
	
	public String actionEditarAluno(){
		System.out.println("editar!!!!");
		System.out.println(this.aluno.getCpf());
		FachadaNegocio negocio = FachadaNegocio.getInstance();
		negocio.editarAluno(this.aluno.getCpf());
		return "EDITAR";
		
	}
}
