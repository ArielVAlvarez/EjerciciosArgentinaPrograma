package Contenedor;

import lombok.Data;

@Data

public class oferta {
	private int descuento;
	private int stock;
	
	oferta(){}

	public oferta(int descuento, int stock) {
		
		this.descuento = descuento;
		this.stock = stock;
	}
	
}
