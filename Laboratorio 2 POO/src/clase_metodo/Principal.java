package clase_metodo;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double ladoA;
		double ladoB;
		
		ladoA = ingresarDatos("Ingrese la longitud del lado A:");
		ladoB = ingresarDatos("Ingrese la longitud del lado B:");
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + calcularArea(ladoA, ladoB));
		
	}
	
	public static double ingresarDatos(String mensaje) {
		double valor = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
		return valor;
	}
	
	public static double calcularArea(double a, double b) {
		return a * b;
	}

}
