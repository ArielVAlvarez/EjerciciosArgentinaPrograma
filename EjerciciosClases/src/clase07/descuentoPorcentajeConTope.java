package clase07;

public class descuentoPorcentajeConTope extends Descuento {

	private double topeDescuento;
	
	descuentoPorcentajeConTope (double valor,double topeDescuento){
		this.setValorDesc(valor);
		this.topeDescuento=topeDescuento;
	}
	@Override
	public double calculoFinal(double importe) {

		if (importe <= this.topeDescuento) {
			double resultado = importe - (importe * this.getValorDesc());
			return resultado;
		}else {
			double resultado = importe - (this.topeDescuento * this.getValorDesc());
			return resultado;
		}
		
		
	}

}
