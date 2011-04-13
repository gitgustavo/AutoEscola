package br.com.sysauto.negocio;

import br.com.sysauto.dao.FachadaDAO;
import br.com.sysauto.model.Aluno;
import br.com.sysauto.util.exceptions.BDException;
import br.com.sysauto.util.exceptions.BusinessException;

public class CadastroAluno {
	
	public CadastroAluno () { }
	
	// Verificar todas as regras de negócio para o cadastro do aluno. 
	// Repassar a chamada para a FachadaDAO.
	
	public boolean cadastrarAluno (Aluno _aluno) throws BusinessException, BDException {
		FachadaDAO dao = FachadaDAO.getInstance();
		return dao.inserirAluno(_aluno);
	}
}
