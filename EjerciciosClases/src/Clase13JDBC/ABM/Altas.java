package Clase13JDBC.ABM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Clase13JDBC.conectorSQL;
import Clase13JDBC.persona;

public class Altas {
	
	private static Connection conexion = null;
    private static Statement consulta = null;
    
	public Altas() {}
	
	public static void InsertDepartamento(int id,String descripcion) {

		 try {
			conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
			consulta = conexion.createStatement();
			
			String instruccionSql = "insert into qatar2022bd.departamento (id_departamento,nombreDepartamento) values (" + id +",\""+descripcion+"\""+")";
			int res = consulta.executeUpdate(instruccionSql);		
			
			System.out.println("Filas Insertadas " + res);		
					
					
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conexion != null) {
					conexion.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
						
		}
	}

	public static void InsertDepartamentoPresupuesto(int id,String descripcion) {

				 try {
					conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
					consulta = conexion.createStatement();
					
					String instruccionSql = "insert into qatar2022bd.departamentoPresupuesto (id_departamento,presupuesto) values (" + id +",\""+descripcion+"\""+")";
					int res = consulta.executeUpdate(instruccionSql);		
					
					System.out.println("Filas Insertadas " + res);		
							
							
				 } catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						if(conexion != null) {
							conexion.close();
						}
					} catch (Exception e2) {
						// TODO: handle exception
					}
								
				}
		 
	}
	
	public static void pais(int id,String descripcion) {

		 try {
			conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
			consulta = conexion.createStatement();
			
			String instruccionSql = "insert into qatar2022bd.pais (id,nombre) values (" + id +",\""+descripcion+"\""+")";
			int res = consulta.executeUpdate(instruccionSql);		
			
			System.out.println("Filas Insertadas " + res);		
					
					
		 } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(conexion != null) {
					conexion.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
						
		}
	}	 
		 public static void empleados(persona p1) {

			 try {
				conexion = DriverManager.getConnection(conectorSQL.DB_URL, conectorSQL.USER, conectorSQL.PASS);
				consulta = conexion.createStatement();
				
				String instruccionSql = "insert into qatar2022bd.empleados (dni,nombre,apellido,id_nacionalidad,id_departamento) values (" + p1.toStringInsert() +")";
				int res = consulta.executeUpdate(instruccionSql);		
				
				System.out.println("Filas Insertadas " + res);		
						
						
			 } catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					if(conexion != null) {
						conexion.close();
					}
				} catch (Exception e2) {
					// TODO: handle exception
				}
							
			}		 

		 }
			
}
