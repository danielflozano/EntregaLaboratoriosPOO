package programacion_orientada_objetos;

import javax.swing.JOptionPane;

public class Entidad {
	double ladoA;
	double ladoB;
	
	public void ingresarDatos() {
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A:"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B:"));
	}
	
	public void calcularArea() {
		Double resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}
}
