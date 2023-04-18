package Clase13JDBC.ABM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

import Clase13JDBC.conectorSQL;

public class Consulta {

		public static Connection conexion;
		public static Statement st;
		
		
		Consulta(){};
		
		public static void consultarEmpleados (String consulta) {
			
			try {
				conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
				st = conexion.createStatement();
				
				ResultSet resultado = st.executeQuery(consulta);
				
				while (resultado.next()) {
									
					System.out.println(
						resultado.getInt("dni")+"#"+
						resultado.getString("nombre")+"#"+
						resultado.getString("apellido")+"#"+
						resultado.getString("nacionalidad")+"#"+
						resultado.getString("nombredepartamento")+"#"+
						resultado.getString("presupuesto")
							);
					
					
				}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		public static void departamentos () throws SQLException {
			
			conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
			st = conexion.createStatement();
			
			ResultSet resul = st.executeQuery("select * from departamento order by 2");
			
			while (resul.next()) {
				
				System.out.println(resul.getInt("id_departamento")+"#"+
						resul.getString("nombreDepartamento"));
			}
		}
}		
