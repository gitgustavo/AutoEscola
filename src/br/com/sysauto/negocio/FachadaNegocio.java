package br.com.sysauto.negocio;

import java.util.List;

import br.com.sysauto.model.Aluno;
import br.com.sysauto.util.exceptions.BDException;
import br.com.sysauto.util.exceptions.BusinessException;

public class FachadaNegocio {
	private static FachadaNegocio singleton = null;

	
	private FachadaNegocio () {
		
	}
	
	public static FachadaNegocio getInstance() {
		if (singleton == null) {
			singleton = new FachadaNegocio ();
		}
		return singleton;
	}
	
	public boolean cadastrarAluno (Aluno _aluno) throws BusinessException, BDException{
		AlunoNegocio alunoNegocio = new AlunoNegocio();

		return alunoNegocio.cadastrarAluno(_aluno);
	}

	public List<Aluno> listarAlunos() {
		AlunoNegocio alunoNegocio = new AlunoNegocio();
		
		return alunoNegocio.listarAlunos();
	}

	public boolean editarAluno(String _cpf) {
		AlunoNegocio alunoNegocio = new AlunoNegocio();
		return alunoNegocio.editarAluno(_cpf);
	}
}
