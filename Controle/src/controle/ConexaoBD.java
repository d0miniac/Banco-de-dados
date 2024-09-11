package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	public static Connection getConexaoMySQL() {
		Connection connection = null;

		// Driver de conexão
		String driverName = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("O driver não foi encontrado.");
		}

		// Nome do servidor
		String serverName = "localhost";

		// Nome do banco de dados
		String mydatabase = "teste";

		// URL de conexão
		String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

		String username = "root";

		String password = "aluno";

		try {
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Não foi possível conectar ao banco de dados.");
		}
		return connection;
	}

}
