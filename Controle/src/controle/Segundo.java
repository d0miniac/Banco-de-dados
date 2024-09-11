package controle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Segundo {

	public static void main(String[] args) {

		// Executa operações no BD
		Statement smtl = null;

		// Faz a conexão com BD
		Connection conn = ConexaoBD.getConexaoMySQL();

		try {
			smtl = (Statement) conn.createStatement();

			// Traz o resultados da consulta SQL
			ResultSet resl = null;
			resl = smtl.executeQuery("SELECT * FROM CLIENTES");
			System.out.println("ID   NOME  E-MAIL");
			while (resl.next()) {
				System.out
						.println(resl.getInt("id") + "   " + resl.getString("nome") + "   " + resl.getString("email"));

			}
			resl.close();
			smtl.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
