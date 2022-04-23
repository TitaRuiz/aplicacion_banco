package com.softtek.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	
	//1. Atributos
	protected Connection miConexion;
	
	//2. Métodos
	public void abrirConexion() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
		   "databaseName=softtek_ejemplo_banco;user=alumno1;password=alumno1;";  
		miConexion = DriverManager.getConnection(connectionUrl);
//	System.out.println("La conexion se ha abierto con exito");
	}
	

}
