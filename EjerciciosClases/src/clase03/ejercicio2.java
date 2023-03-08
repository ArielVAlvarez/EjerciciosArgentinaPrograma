package clase03;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena=encripta("hola mundo", 8);
		System.out.println("Cadena a Encriptar "+"hola mundo");
		System.out.println("Cadena Encriptada "+cadena);
		
		System.out.println("Cadena Desencriptada "+desencripta(cadena, 8));
	}

	public static String encripta(String cadena,int desplaza) {

		String crypto=" abcdefghijklmnñopqrstuvwxyz";
		String cadenaCrypto="";
		
		for (int m=0;m<cadena.length();m++) {
			if (crypto.indexOf(cadena.charAt(m))+desplaza<=crypto.length()-1) {
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.indexOf(cadena.charAt(m))+desplaza);
			}else {
				int resto = (crypto.indexOf(cadena.charAt(m))+desplaza)-(crypto.length());
				cadenaCrypto=cadenaCrypto+crypto.charAt(resto);				
			}
		}

		return cadenaCrypto;
	}
	
	public static String desencripta(String cadena,int desplaza) {

		String crypto=" abcdefghijklmnñopqrstuvwxyz";
		String cadenaCrypto="";
		
		for (int m=0;m<cadena.length();m++) {
			if (crypto.indexOf(cadena.charAt(m))-desplaza>=0) {
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.indexOf(cadena.charAt(m))-desplaza);
			}else {
				int resto = crypto.indexOf(cadena.charAt(m))-desplaza;				
				cadenaCrypto=cadenaCrypto+crypto.charAt(crypto.length()-(resto)*-1);
			}
		}

		return cadenaCrypto;
	}
	
}
