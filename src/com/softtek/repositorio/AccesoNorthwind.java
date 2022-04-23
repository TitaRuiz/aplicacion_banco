package com.softtek.repositorio;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.softtek.modelo.Movimiento;

public class AccesoNorthwind extends Conexion{
	
	
	public int ejecutarProc(Movimiento m) throws ClassNotFoundException, SQLException{
		//1. Definir variables
		int resultado = 0;
		int transaccion = 0;
		CallableStatement st;		
		String sql = "{? = call usp_movimiento(?,?,?,?)}";
		abrirConexion();
		//3. Obtener el statement
		st = miConexion.prepareCall(sql);
		st.registerOutParameter(1, java.sql.Types.INTEGER);
		st.setString(2, m.getCuenta());
		st.setString(3, m.getTipoMovimiento().toString());
		st.setDouble(4, m.getCantidad());
		st.registerOutParameter(5, java.sql.Types.INTEGER);
		//4. Ejecutar el statement
		st.execute();
		resultado = st.getInt(1);
		transaccion = st.getInt(5);
//		System.out.println(resultado);
		//6. Cerrar la conexion
		miConexion.close();
		//7. Devolver el resultado
		return transaccion;
	}
	

}
