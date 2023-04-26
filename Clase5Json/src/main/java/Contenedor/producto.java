package Contenedor;

//import lombok.Data;
//import lombok.RequiredArgsConstructor;

//@Data

public class producto {
	
	private String nombre;
	private float precio;
	private int stock;
	private oferta oferta;

	@Override
	public String toString() {
		return "producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", oferta=" + oferta.getDescuento() + "]";
	}

	producto() {}
	
	producto (String nombre,float precio,int stock,oferta oferta) {
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
		this.oferta=oferta;
		
	}	

	
	public oferta getOferta() {
		return oferta;
	}

	public void setOferta(oferta oferta) {
		this.oferta = oferta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	
}
