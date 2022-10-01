package conexao;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {

	private Connection conn;
	public Connection conectaBD() {
		Connection conn=null;
		
		try {
			String url = "jdbc:mysql://localhost:3306/Container1?user=root&password=password";
			conn = DriverManager.getConnection(url);
			
		}catch (Exception erro) {
			System.out.println("Erro ao conectar");
			
		}return conn;
	}
		
		public Connection desconectaBD() {
			if( conn != null);
			try {
				conn.close();
				System.out.println("conectado com sucesso!");
				
			}catch (Exception erro) {
				
				System.out.println();
			}
			return conn;
		
	}
	
	
}
