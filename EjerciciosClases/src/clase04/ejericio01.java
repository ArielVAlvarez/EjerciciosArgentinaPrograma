package clase04;

public class ejericio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (args.length>0) {
			if (args[3].equals("a")) {
				ordenar.Ordenar(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),false);
			}else {
				
				ordenar.Ordenar(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]),false);
			}
		}
	}

	
}
