package clase07;

import java.time.LocalDateTime;

import clase05.persona;
import clase05.producto;

public class carrito2 extends clase05.carrito {

	private Descuento descuento;
	
	public carrito2(persona per1, producto pr1, producto pr2, producto pr3, LocalDateTime fechacompra,
			Descuento descuento) {
		super(per1, pr1, pr2, pr3, fechacompra);
		this.descuento = descuento;
	}

	@Override
	public Double costofinal() {
		// TODO Auto-generated method stub
		double resultado = this.descuento.calculoFinal(super.costofinal());
		
		return  resultado;
	}
	
	public Double neto() {
		return super.costofinal();
	}

}
