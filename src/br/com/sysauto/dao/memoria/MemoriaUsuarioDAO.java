package br.com.sysauto.dao.memoria;

import java.util.List;
import java.util.Vector;

import br.com.sysauto.model.Usuario;
import br.com.sysauto.util.exceptions.BDException;

public class MemoriaUsuarioDAO {

	private static MemoriaUsuarioDAO singleton = null;
	private List<Usuario> usuarios;
	
	private MemoriaUsuarioDAO() {
		// TODO Auto-generated constructor stub
		this.usuarios = new Vector<Usuario> (); 
	}

	public static MemoriaUsuarioDAO getInstance() { 
		if (singleton == null) {
			singleton = new MemoriaUsuarioDAO ();
		}
		return singleton;
	}
	

	public boolean inserir(Usuario _usuario) throws BDException {
		// TODO Auto-generated method stub
		return this.usuarios.add(_usuario);
	}


	public boolean editar(Usuario _usuario) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.usuarios.indexOf(_usuario);
		boolean result = false;
		if (idx != -1) {
			this.usuarios.add(idx, _usuario);
			result = true;
		}
		return result;
	}


	public List<Usuario> listarTodos() throws BDException {
		// TODO Auto-generated method stub
		return usuarios;
	}


	public boolean excluir(String _cpfUsuario) throws BDException {
		// TODO Auto-generated method stub
		int idx = this.busca(_cpfUsuario);
		boolean result = false;
		if (idx != -1) {
			this.usuarios.remove(idx);
			result = true;
		}
		return result;
	}
	
	private int busca (String _cpfUsuario) throws BDException {
		int result = -1;
		for (int i = 0; i < this.usuarios.size() ; i++) {
			if (this.usuarios.get(i).getCpf().equals(_cpfUsuario)) {
				result = i;
				i = this.usuarios.size();
			}
		}
		return result;
	}


}
