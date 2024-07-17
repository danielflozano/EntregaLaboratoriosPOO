
public class Principal {
	Flecha flecha1, flecha2, flecha3, flecha4;

	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		flecha1 = new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longitud = 34;
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(12, "negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();	
		
		flecha4 = new Flecha();
		flecha4.pedirDatos();
		flecha4.construirFlecha();
	}
}
