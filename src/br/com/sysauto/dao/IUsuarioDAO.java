package br.com.sysauto.dao;

import java.util.List;

import br.com.sysauto.model.Usuario;
import br.com.sysauto.util.exceptions.BDException;

public interface IUsuarioDAO {
	public boolean inserir(Usuario _usuario) throws BDException;
	public boolean editar(Usuario _usuario) throws BDException;
	public List<Usuario> listarTodos() throws BDException;
	public boolean excluir(String _cpfUsuario) throws BDException;
}
