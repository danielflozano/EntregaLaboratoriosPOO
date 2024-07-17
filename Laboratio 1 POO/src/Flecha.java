import javax.swing.JOptionPane;

public class Flecha {
	int longitud;
	String color;
	
	public Flecha() {
		longitud = 18;
		color = "negro";
	}
		
	public Flecha(int longitud, String color) {
		this.longitud = longitud;
		this.color = color;
	}
	
	public void pedirDatos() {
		longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud de flecha que desea"));
		int opcColor;
		do {
			opcColor = Integer.parseInt(JOptionPane.showInputDialog("ELIGA UN COLOR\n\n"
					+ "1. negro\n"
					+ "2. rojo\n"));
			switch (opcColor) {
			case 1:
				color = "negro";
				break;
			case 2:
				color = "rojo";
				break;
			default:
				JOptionPane.showMessageDialog(null, "El dato ingresado no corresponde a ningún color");
				break;
			}
		} while (opcColor != 1 && opcColor != 2);
	}
	
	public void imprimirEspacio() {
		System.out.println();
	}
	
	public void construirFlecha() {
		for (int i = 0; i < longitud; i++) {
			imprime("-");
		}
		imprime(">");
	}

	private void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		} else {
			System.err.print(simbolo);
		}		
	}
}
