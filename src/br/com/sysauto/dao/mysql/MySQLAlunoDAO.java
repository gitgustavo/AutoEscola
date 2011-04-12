package br.com.sysauto.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.sysauto.util.exceptions.BDException;
import br.com.sysauto.dao.IAlunoDAO;
import br.com.sysauto.model.Aluno;


public class MySQLAlunoDAO implements IAlunoDAO{
	Connection conexao;
	
	public MySQLAlunoDAO(Connection conexao) throws BDException {
		this.conexao = conexao;
	}
	
	public boolean inserir(Aluno _aluno) throws BDException {
		boolean retorno = false;
		
		String comando = "insert into aluno (cpf, nome, nascimento, cep, cidade, estado, rua, numero, bairro, complemento, telefone1, telefone2, email, login, senha)"+
		"values(?,?,?,?,?,?,?,?,?,?,?,?)";
	
		try {
			PreparedStatement p = this.conexao.prepareStatement(comando);
			
			p.setString(1, _aluno.getCpf());
			p.setString(2, _aluno.getNome());
			p.setString(3, _aluno.getDataNascimento());
			p.setString(4, _aluno.getCep());
			p.setString(5, _aluno.getCidade());
			p.setString(6, _aluno.getEstado());
			p.setString(7, _aluno.getRua());
			p.setString(8, _aluno.getNumero());
			p.setString(9, _aluno.getBairro());
			p.setString(10, _aluno.getComplemento());
			p.setString(11, _aluno.getTelefone1());
			p.setString(12, _aluno.getTelefone2());
			p.setString(13, _aluno.getEmail());
			p.setString(13, _aluno.getLogin());
			p.setString(13, _aluno.getSenha());
	
			p.execute();
			
			retorno = true;
		} catch (SQLException e) {
			System.out.println("Ocorreu erro na hora de inserir a Empresa try catch");
			e.printStackTrace();
		}
		
		return retorno;
	}

	public boolean editar(Aluno _aluno) throws BDException {
		
		boolean retorno = false;
		
		String comando = "update aluno set cpf=?, nome=?, nascimento=?, cep=?, cidade=?, estado=?, rua=?, numero=?, bairro=?, complemento=?, telefone1=?, telefone2=?, email=?, login=?, senha=? where cpf=?;";
		
		try {
			PreparedStatement p = this.conexao.prepareStatement(comando);
			
			p.setString(1, _aluno.getCpf());
			p.setString(2, _aluno.getNome());
			p.setString(3, _aluno.getDataNascimento());
			p.setString(4, _aluno.getCep());
			p.setString(5, _aluno.getCidade());
			p.setString(6, _aluno.getEstado());
			p.setString(7, _aluno.getRua());
			p.setString(8, _aluno.getNumero());
			p.setString(9, _aluno.getBairro());
			p.setString(10, _aluno.getComplemento());
			p.setString(11, _aluno.getTelefone1());
			p.setString(12, _aluno.getTelefone2());
			p.setString(13, _aluno.getEmail());
			p.setString(13, _aluno.getLogin());
			p.setString(13, _aluno.getSenha());
		
			p.execute();
			
			retorno = true;
		} catch (SQLException e) {
			System.out.println("Ocorreu erro na hora de editar a Empresa try catch");
			e.printStackTrace();
		}
		
		return retorno;
		
	}

	public List<Aluno> listarTodos() throws BDException {
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		String comando = "select * from aluno";
		
		try {
			java.sql.Statement start = conexao.createStatement();
			ResultSet rs = start.executeQuery(comando);
			
			while(rs.next()){
				Aluno aluno = new Aluno();
				
				aluno.setCpf(rs.getString("cpf"));
				aluno.setNome(rs.getString("nome"));
				aluno.setDataNascimento(rs.getString("dataNascimento"));
				aluno.setCep(rs.getString("cep"));
				aluno.setCidade(rs.getString("cidade"));
				aluno.setEstado(rs.getString("estado"));
				aluno.setRua(rs.getString("rua"));
				aluno.setNumero(rs.getString("numero"));
				aluno.setBairro(rs.getString("bairro"));
				aluno.setComplemento(rs.getString("complemento"));
				aluno.setTelefone1(rs.getString("telefone1"));
				aluno.setTelefone2(rs.getString("telefone2"));
				aluno.setEmail(rs.getString("email"));
				aluno.setLogin(rs.getString("login"));
			
				alunos.add(aluno);
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("Ocorreu erro na hora de Listar os Alunos try catch");
			e.printStackTrace();
		}
		return alunos;
	}

	public boolean excluir(String _cpfAluno) throws BDException {
		
		boolean retorno = false;
		
		String comando = "delete from aluno where cpf=?;";
		try {
			PreparedStatement p = this.conexao.prepareStatement(comando);
			p.setString(1, _cpfAluno);
			
			p.execute();
			
			retorno = true;
		} catch (SQLException e) {
			System.out.println("Ocorreu erro na hora de excluir a Aluno try catch");
			e.printStackTrace();
		}
		
		return retorno;
	}
}
