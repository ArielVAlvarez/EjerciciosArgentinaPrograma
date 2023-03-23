package clase07;

public abstract class Descuento {
	private double valorDesc;

	public double getValorDesc() {
		return valorDesc;
	}

	public void setValorDesc(double valorDesc) {
		this.valorDesc = valorDesc;
	}
	
	public abstract double calculoFinal (double importe) ;

}
