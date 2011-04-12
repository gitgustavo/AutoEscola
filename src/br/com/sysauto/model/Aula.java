package br.com.sysauto.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Aula {
	private int idAula;
	private Professor professor;
	private Date data;
	private Time hora;
	private String sala;
	private Disciplina aula;
	private List<Aluno> alunos;
	private String tipo;
	
	public Aula(int idAula, Professor professor, Date data, Time hora,
			String sala, Disciplina aula, List<Aluno> alunos, String tipo) {
		this.idAula = idAula;
		this.professor = professor;
		this.data = data;
		this.hora = hora;
		this.sala = sala;
		this.aula = aula;
		this.alunos = alunos;
		this.tipo = tipo;
	}
	public Aula() {
		
	}
	public int getIdAula() {
		return idAula;
	}
	public void setIdAula(int idAula) {
		this.idAula = idAula;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public Disciplina getAula() {
		return aula;
	}
	public void setAula(Disciplina aula) {
		this.aula = aula;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
