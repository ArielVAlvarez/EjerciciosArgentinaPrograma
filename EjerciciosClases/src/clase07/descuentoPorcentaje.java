package clase07;

public class descuentoPorcentaje extends Descuento {

	public descuentoPorcentaje (double valorDescuento){
		this.setValorDesc(valorDescuento);
	}
	@Override
	public double calculoFinal(double importe) {
		double resultado = importe - (importe * this.getValorDesc());
		return resultado;
	}

}
