package Clase13JDBC.ABM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clase13JDBC.conectorSQL;

public class Modificacion {

	public static Connection conexion = null;
	public static Statement consulta = null;
	
	Modificacion(){};
	
	public static void modificaempleado (int nacionalidad,int id) {
		
		try {
			conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
			consulta = conexion.createStatement();
							
			int resultado = consulta.executeUpdate("update qatar2022BD.empleados set id_nacionalidad=" + nacionalidad + 
						" where dni=" + id);
			
			System.out.println("Filas Afectadas "+ resultado);
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
