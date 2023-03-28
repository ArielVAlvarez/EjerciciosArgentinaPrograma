package clase07;

public class descuentoFijo extends Descuento {

	public descuentoFijo (double valorDescuento){			
		this.setValorDesc(valorDescuento);
	}
	@Override
	public double calculoFinal(double importe) {
		double resultado = importe - this.getValorDesc();
		return resultado;
	}

}
