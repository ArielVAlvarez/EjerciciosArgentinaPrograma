package clase08;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDateTime;
import java.util.ArrayList;

import clase05.persona;
import clase05.producto;
import clase07.Descuento;
import clase07.carrito2;

public class Carrito03 extends carrito2 {

	private ArrayList<producto> Productos = new ArrayList<>();

	public Carrito03(persona per1, producto pr1, producto pr2, producto pr3, LocalDateTime fechacompra,
			Descuento descuento) {
		super(per1, pr1, pr2, pr3, fechacompra, descuento);
		// TODO Auto-generated constructor stub
	}
	public ArrayList<producto> getProductos() {
		return Productos;
	}
	public void setDescuento(Descuento des) {
		this.descuento=des;
	}
	@Override
	public Double costofinal() throws importeCeroException {
		double sumaTotal = 0;
		
		for (int i=0;i<this.Productos.size();i++) {
			
			Float mm = Productos.get(i).getPrecio();						
			sumaTotal = sumaTotal + Double.parseDouble(mm.toString()); 
		}
		
		if (sumaTotal==0) {
			throw new importeCeroException(sumaTotal);
			
		}else {
			if (this.descuento.calculoFinal(sumaTotal)<0) {
				throw new importeCeroException(this.descuento.calculoFinal(sumaTotal));
			}else {
				return this.descuento.calculoFinal(sumaTotal);}
		}
		
		
	}
	
	@Override
	public double neto() {
		double sumaTotal = 0;
		
		for (int i=0;i<this.Productos.size();i++) {
			
			Float mm = Productos.get(i).getPrecio();						
			sumaTotal = sumaTotal + Double.parseDouble(mm.toString()); 
		}
		
		
		return sumaTotal;
	}
	public void setProductos(producto productos) {
		this.Productos.add(productos);
	}

	

}
