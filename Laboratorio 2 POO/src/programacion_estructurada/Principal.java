package programacion_estructurada;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double ladoA;
		double ladoB;
		double resultado;
		
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A:"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B:"));
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
}
