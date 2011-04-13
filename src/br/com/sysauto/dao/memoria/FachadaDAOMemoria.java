package br.com.sysauto.dao.memoria;


public class FachadaDAOMemoria {
	private static FachadaDAOMemoria singleton = null;
	
	private FachadaDAOMemoria () {
		
	}
	
	public static FachadaDAOMemoria getInstance() {
		if (singleton == null) {
			singleton = new FachadaDAOMemoria ();
		}
		return singleton;
	}
	
	
}
