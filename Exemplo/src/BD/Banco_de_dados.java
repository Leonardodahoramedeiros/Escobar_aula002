package BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Banco_de_dados {
	private static Banco_de_dados instancia;
	private static String url = "jdbc:mysql://localhost:3306/coisas";
	private static String user = "root";
	private static String password = "";
	private Connection connection;
	
	private Banco_de_dados() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Banco_de_dados getInstancia() {
		if(instancia == null) {
			instancia = new Banco_de_dados();
			return instancia;
		}else {
			return instancia;
		}
		
	}
	public Connection getConnection() {
		return this.connection;
	}
	
	

}
