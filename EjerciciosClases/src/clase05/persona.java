package clase05;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class persona {
	private String nombre;
	private String apellido;
	private LocalDateTime fechanacimiento;
	
	public persona(String nombre, String apellido, LocalDateTime fechanacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanacimiento = fechanacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(LocalDateTime fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public Integer edad() {
		LocalDateTime fecha1 = LocalDateTime.now();
		
		long dias = Duration.between(this.fechanacimiento,fecha1).toDays();
		int edad = (int)(dias/365.2425);
		
		return edad;
	}
}
