package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection conn;
	public Connection conectaBD() {
		Connection conn = null;
		
		try {
			String url = "jdbc:mysql://localholt:3306/Container2?user=root&password=password";
			conn = DriverManager.getConnection(url);
			
		}catch (Exception erro) {
			System.out.println("Erro ao conectar");
		}return conn;
				
	}
	public Connection desconectaBD() {
		if( conn != null);
		try {
			conn.close();
			System.out.println("Conectado com sucesso!");
		}catch (SQLException Erro) {
			System.out.println();
		}
		return conn;
	}
}
