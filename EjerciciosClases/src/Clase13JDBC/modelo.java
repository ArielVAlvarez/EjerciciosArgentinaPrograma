package Clase13JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clase13JDBC.ABM.Altas;
import Clase13JDBC.ABM.Consulta;
import Clase13JDBC.ABM.Eliminar;
import Clase13JDBC.ABM.Modificacion;

public class modelo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		Altas.InsertDepartamento(1,"Logistica");
		Altas.InsertDepartamento(2,"Sistemas");
		Altas.InsertDepartamento(3,"Compras");
		*/
		
		/*
		Altas.InsertDepartamentoPresupuesto(1,"10000000");
		Altas.InsertDepartamentoPresupuesto(2,"2000000");
		Altas.InsertDepartamentoPresupuesto(3,"15000000");
		*/ 
		/*
		Altas.pais(1,"Argentina");
		Altas.pais(2,"Brasil");
		Altas.pais(3,"España");
		*/
		
		/*
		Altas.empleados(new persona(24230539,"Ariel","Alvarez",1,2));
		Altas.empleados(new persona(22078675,"Carola","Juarez",1,1));
		Altas.empleados(new persona(35455688,"Lorena","Fernandez",2,1));
		Altas.empleados(new persona(38755429,"Fabricio","Peralta",3,1));
		*/
		
		//Modificacion.modificaempleado(2, 38755429);
		
		//Eliminar.EliminaDepartamento(3);
		
		String consulta = "select tb1.dni,tb1.nombre,tb1.apellido,tb2.nombre as \"Nacionalidad\",tb3.nombreDepartamento,\r\n"
				+ "    tb4.presupuesto from empleados as tb1\r\n"
				+ "    inner join pais as tb2 on tb1.id_nacionalidad=tb2.id \r\n"
				+ "    inner join departamento as tb3 on tb1.id_departamento=tb3.id_departamento \r\n"
				+ "    inner join departamentoPresupuesto as tb4 on tb4.id_departamento=tb3.id_departamento\r\n"
				+ "    where tb1.id_departamento=1;\r\n";
		
						
		Consulta.consultarEmpleados(consulta);
		try {
			Consulta.departamentos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
