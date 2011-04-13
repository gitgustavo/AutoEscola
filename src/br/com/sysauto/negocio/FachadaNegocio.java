package br.com.sysauto.negocio;

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
		CadastroAluno cadastro = new CadastroAluno ();
		return cadastro.cadastrarAluno(_aluno);	
	}
}
