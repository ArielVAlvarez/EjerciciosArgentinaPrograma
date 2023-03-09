package clase04;

public class operacionesmatematicas {
	int resultadoSuma = 0;
	int resultadoMultilicacion = 1;
	
	
	public void valoresSuma (int numero) {
		this.resultadoSuma = this.resultadoSuma + numero;
	}
	public int resultadoSuma() {
		return resultadoSuma;
	}
	public void valoresMultiplicacion (int numero) {
		this.resultadoMultilicacion = this.resultadoMultilicacion * numero;
	}
	public int resultadoMultiplicacion() {
		return resultadoMultilicacion;
	}
	
	
}
