package clase04;

public class ordenar {
	
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

}
