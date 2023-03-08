package clase03;

public class ejercicio01 {
	public static void main(String[] args) {
		ContarLetras("Hola Mundo",'o');
		Ordenar(105,11, 35, true);
		
		int numeros[]=new int[] {1,5,9,8,7,6,25,66,33,88};
		sumaNumeros(numeros,10);
	}	
	 public static void ContarLetras (String cadena,char mascara) {
		int cantidad = 0;
		 for (int i=0;i<=cadena.length()-1;i++) {
			 if (cadena.charAt(i)==mascara) {
				 cantidad++;
			 }
		 }
		 
		 System.out.println("La cantidad de apariciones son " + cantidad);
	}
	 public static void Ordenar (int numero1,int numero2,int numero3,boolean asc) {
		 int numeroauxiliar;
		 int arrayOrdena[] = new int[] {numero1,numero2,numero3};
		 if (asc==true) {
			
			 for (int n=0;n<arrayOrdena.length-1;n++) {
				 for (int x=n+1;x<=arrayOrdena.length-1;x++) {
					 if (arrayOrdena[n]>arrayOrdena[x]) {
						 	numeroauxiliar=arrayOrdena[n];
						 	arrayOrdena[n]=arrayOrdena[x];
						 	arrayOrdena[x]=numeroauxiliar;
					 }
					 
				 }
				 
			 }
		 }else {
			 for (int n=0;n<arrayOrdena.length-1;n++) {
				 for (int x=n+1;x<=arrayOrdena.length-1;x++) {
					 if (arrayOrdena[n]<arrayOrdena[x]) {
						 	numeroauxiliar=arrayOrdena[n];
						 	arrayOrdena[n]=arrayOrdena[x];
						 	arrayOrdena[x]=numeroauxiliar;
					 }
					 
				 }
			 }
		 }
		 
		 System.out.println("Los numeros ordenados son ....");
		 for (int resultado:arrayOrdena) {
			 System.out.println(resultado);
		 }
	 }
	
	 public static void sumaNumeros(int vector[],int comodin) {
		 int resultado=0;
		 for (int numeros:vector) {
			 if (numeros>comodin) {
				 resultado=resultado+numeros;
			 }
		 }
		 System.out.println("La suma de los numeros es ---- "+resultado);
	 }
}
