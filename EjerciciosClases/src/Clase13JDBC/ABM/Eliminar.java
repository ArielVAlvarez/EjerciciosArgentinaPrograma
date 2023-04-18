package Clase13JDBC.ABM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clase13JDBC.conectorSQL;

public class Eliminar {

		public static Connection conexion;
		public static Statement consulta;
		
		Eliminar(){};
		
		public static void EliminaDepartamento (int id_departamento) {
			
			try {
				conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
				
				consulta = conexion.createStatement();
				int resultado = consulta.executeUpdate("delete from qatar2022BD.departamento where id_departamento=" + id_departamento);
				
				System.out.println("Filas Afectadas " + resultado);
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
}
