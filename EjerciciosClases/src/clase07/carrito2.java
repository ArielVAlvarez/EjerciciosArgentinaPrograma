package clase07;

import java.time.LocalDateTime;

import clase05.persona;
import clase05.producto;
import clase08.importeCeroException;

public class carrito2 extends clase05.carrito {

	public Descuento descuento;
	
	public carrito2(persona per1, producto pr1, producto pr2, producto pr3, LocalDateTime fechacompra,
			Descuento descuento) {
		super(per1, pr1, pr2, pr3, fechacompra);
		this.descuento = descuento;
	}

	@Override
	public Double costofinal() throws importeCeroException {
		// TODO Auto-generated method stub
		double resultado = this.descuento.calculoFinal(super.costofinal());
		
		return  resultado;
	}
	
	public double neto() {
		try {
			return super.costofinal();
		} catch (importeCeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
