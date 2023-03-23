package clase07;

public class descuentoFijo extends Descuento {

	descuentoFijo (double valorDescuento){			
		this.setValorDesc(valorDescuento);
	}
	@Override
	public double calculoFinal(double importe) {
		double resultado = importe - this.getValorDesc();
		return resultado;
	}

}
