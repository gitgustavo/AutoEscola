package br.com.sysauto.dao;

import java.sql.Connection;
import java.util.List;

import br.com.sysauto.model.Aluno;
import br.com.sysauto.model.Aula;
import br.com.sysauto.model.Disciplina;
import br.com.sysauto.model.Professor;
import br.com.sysauto.model.Usuario;
import br.com.sysauto.model.Veiculo;
import br.com.sysauto.util.exceptions.BDException;


public class FachadaDAO {
	
	private static FachadaDAO singleton = null;
	
	private Connection conexao;
	private DAOFactory factory;
	
	public static FachadaDAO getInstance() {
        if (singleton == null) {
	        // "lazy instantiation"
	        singleton = new FachadaDAO();
        }
        return singleton;
    }
	
	private FachadaDAO(){	
	}
	
	private Connection openConexaoBanco() throws BDException{
		this.factory = DAOFactory.getDAOFactory(DAOFactory.MEMORIA);		
		this.conexao = this.factory.openConexao();
		
		return this.conexao;
	}
	
	private void closeConexaoBanco() throws BDException{
		this.factory.closeConexao();
	}
	
	public boolean inserirAluno(Aluno _aluno) throws BDException {
		boolean retorno = false;
		
		IAlunoDAO alunoDAO = this.factory.getAlunoDAO(this.openConexaoBanco());
		
		retorno = alunoDAO.inserir(_aluno);
		
		this.closeConexaoBanco();
		return retorno;
	}

	public boolean editarAluno(Aluno _aluno)throws BDException {
		boolean retorno = false;
		
		IAlunoDAO alunoDAO = this.factory.getAlunoDAO(this.openConexaoBanco());
		
		retorno = alunoDAO.editar(_aluno);
		
		this.closeConexaoBanco();
		return retorno;
	}

	public List<Aluno> listarAlunos() throws BDException {
		
		IAlunoDAO alunoDAO = this.factory.getAlunoDAO(this.openConexaoBanco());
		
		List<Aluno> alunos = alunoDAO.listarTodos();
		
		this.closeConexaoBanco();
		return alunos;
	}

	public boolean excluirAluno(String _cpfAluno) throws BDException {
		boolean retorno = false;
		
		IAlunoDAO alunoDAO = this.factory.getAlunoDAO(this.openConexaoBanco());
		
		retorno = alunoDAO.excluir(_cpfAluno);
		
		this.closeConexaoBanco();
		return retorno;
	}
	
	public boolean inserirAula(Aula _aula) throws BDException {
		boolean retorno = false;
		
		IAulaDAO aulaDAO = this.factory.getAulaDAO(this.openConexaoBanco());
		
		retorno = aulaDAO.inserir(_aula);
		
		this.closeConexaoBanco();
		return retorno;

	}

	public boolean editarAula(Aula _aula) throws BDException {
		boolean retorno = false;
		
		IAulaDAO aulaDAO = this.factory.getAulaDAO(this.openConexaoBanco());
		
		retorno = aulaDAO.editar(_aula);
		
		this.closeConexaoBanco();
		return retorno;
	}

	public List<Aula> listarAulas() throws BDException {
	
		IAulaDAO aulaDAO = this.factory.getAulaDAO(this.openConexaoBanco());
		
		List<Aula> aulas = aulaDAO.listarTodos();
		
		this.closeConexaoBanco();
		return aulas;
	}

	public boolean excluirAula(String _idAula) throws BDException {
		boolean retorno = false;
		
		IAulaDAO aulaDAO = this.factory.getAulaDAO(this.openConexaoBanco());
		
		retorno = aulaDAO.excluir(_idAula);
		
		this.closeConexaoBanco();
		return retorno;
	}
	
	public boolean inserirDisciplina(Disciplina _disciplina) throws BDException {
		boolean retorno = false;
		
		IDisciplinaDAO disciplinaDAO = this.factory.getDisciplinaDAO(this.openConexaoBanco());
		
		retorno = disciplinaDAO.inserir(_disciplina);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public boolean editarDisciplina(Disciplina _disciplina) throws BDException {
		boolean retorno = false;
		
		IDisciplinaDAO disciplinaDAO = this.factory.getDisciplinaDAO(this.openConexaoBanco());
		
		retorno = disciplinaDAO.editar(_disciplina);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public List<Disciplina> listarDisciplinas() throws BDException {
		
		IDisciplinaDAO disciplinaDAO = this.factory.getDisciplinaDAO(this.openConexaoBanco());
		
		List<Disciplina> disciplinas = disciplinaDAO.listarTodos();
		
		this.closeConexaoBanco();
		
		return disciplinas;
	}

	public boolean excluirDisciplina(String _idDisciplina) throws BDException {
		boolean retorno = false;
		
		IDisciplinaDAO disciplinaDAO = this.factory.getDisciplinaDAO(this.openConexaoBanco());
		
		retorno = disciplinaDAO.excluir(_idDisciplina);
		
		this.closeConexaoBanco();
		
		return retorno;
	}
	
	public boolean inserirProfessor(Professor _professor) throws BDException {
		boolean retorno = false;
		
		IProfessorDAO professorDAO = this.factory.getProfessorDAO(this.openConexaoBanco());
		
		retorno = professorDAO.inserir(_professor);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public boolean editarProfessor(Professor _professor) throws BDException {
		boolean retorno = false;
		
		IProfessorDAO professorDAO = this.factory.getProfessorDAO(this.openConexaoBanco());
		
		retorno = professorDAO.editar(_professor);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public List<Professor> listarProfessores() throws BDException {
		
		IProfessorDAO professorDAO = this.factory.getProfessorDAO(this.openConexaoBanco());
		
		List<Professor> professores = professorDAO.listarTodos();
		
		this.closeConexaoBanco();
		
		return professores;
	}

	public boolean excluirProfessor(String _cpfProfessor) throws BDException {
		boolean retorno = false;
		
		IProfessorDAO professorDAO = this.factory.getProfessorDAO(this.openConexaoBanco());
		
		retorno = professorDAO.excluir(_cpfProfessor);
		
		this.closeConexaoBanco();
		
		return retorno;
	}
	
	public boolean inserirUsuario(Usuario _usuario) throws BDException {
		boolean retorno = false;
		
		IUsuarioDAO usuarioDAO = this.factory.getUsuarioDAO(this.openConexaoBanco());
		
		retorno = usuarioDAO.inserir(_usuario);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public boolean editarUsuario(Usuario _usuario) throws BDException {
		boolean retorno = false;
		
		IUsuarioDAO usuarioDAO = this.factory.getUsuarioDAO(this.openConexaoBanco());
		
		retorno = usuarioDAO.editar(_usuario);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public List<Usuario> listarUsuarios() throws BDException {
		IUsuarioDAO usuarioDAO = this.factory.getUsuarioDAO(this.openConexaoBanco());
		
		List<Usuario> usuarios = usuarioDAO.listarTodos();
		
		this.closeConexaoBanco();
		
		return usuarios;
	}

	public boolean excluirUsuario(String _cpfUsuario) throws BDException {
		boolean retorno = false;
		
		IUsuarioDAO usuarioDAO = this.factory.getUsuarioDAO(this.openConexaoBanco());
		
		retorno = usuarioDAO.excluir(_cpfUsuario);
		
		this.closeConexaoBanco();
		
		return retorno;
	}
	
	public boolean inserirVeiculo(Veiculo _veiculo) throws BDException {
		boolean retorno = false;
		
		IVeiculoDAO veiculoDAO = this.factory.getVeiculoDAO(this.openConexaoBanco());
		
		retorno = veiculoDAO.inserir(_veiculo);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public boolean editarVeiculo(Veiculo _veiculo) throws BDException {
		boolean retorno = false;
		
		IVeiculoDAO veiculoDAO = this.factory.getVeiculoDAO(this.openConexaoBanco());
		
		retorno = veiculoDAO.editar(_veiculo);
		
		this.closeConexaoBanco();
		
		return retorno;
	}

	public List<Veiculo> listarVeiculos() throws BDException {

		IVeiculoDAO veiculoDAO = this.factory.getVeiculoDAO(this.openConexaoBanco());
		
		List<Veiculo> veiculos = veiculoDAO.listarTodos();
		
		this.closeConexaoBanco();
		
		return veiculos;
	}

	public boolean excluirVeiculo(String _placaVeiculo) throws BDException {
		boolean retorno = false;
		
		IVeiculoDAO veiculoDAO = this.factory.getVeiculoDAO(this.openConexaoBanco());
		
		retorno = veiculoDAO.excluir(_placaVeiculo);
		
		this.closeConexaoBanco();
		
		return retorno;
	}
}
