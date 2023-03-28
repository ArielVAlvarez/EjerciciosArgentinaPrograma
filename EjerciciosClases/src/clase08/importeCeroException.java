package clase08;

public class importeCeroException extends Exception {
	
	private double valorAVerificar;

	public importeCeroException(double valorAVerificar) {
		this.valorAVerificar = valorAVerificar;
	}
	
	public void validaError() {
		if (this.valorAVerificar==0) {
			System.out.println("No se puede calcular el costo del Carrito ya que el mismo es Cero(0)");
		}
		if (this.valorAVerificar<0) {
			System.out.println("El costo del carrito es incorrecto porque el descuento es superior al monto de compra");
		}
		
	}
}
