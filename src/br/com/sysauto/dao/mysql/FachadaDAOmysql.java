package br.com.sysauto.dao.mysql;

public class FachadaDAOmysql {

	private static FachadaDAOmysql singleton = null;

	private FachadaDAOmysql() {

	}

	public static FachadaDAOmysql getInstance() {
		if (singleton == null) {
			singleton = new FachadaDAOmysql();
		}
		return singleton;
	}
}
