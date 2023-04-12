package PersonaGestion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Participantes participantes = new Participantes();
		
		participantes.armarListaParticipantes("archivos/participantes.csv");
		participantes.ListarParticipantes();
	}

}
