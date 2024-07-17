package bonus;

import javax.swing.JOptionPane;

public class Numeros {
	int numer;
	int i, neg = 0, par = 0;
	
	// Este metodo primero tien un ciclo para pedirle 5 veces al usuario que digite un número (Mediante
	// el metodo ingresarDatos), si el numero es par lo ingresa en el contador par, si es negativo, lo ingresa
	// en el contador negativo. y por ultimo mediante una ventana emergente imprime un mensaje con el total de
	// números pares y negativos.
	public void entrada() {
		for (i = 0; i < 5; i++) {
			numer = ingresarDatos ("Digite un numero");
			if ( numer % 2 == 0) {
				par++;
			}
			if (numer < 0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "El número de números pares es: " + par + "\n"
				+ " y el número de números negativos es: " + neg);
	}
	
	// Este metodo se encarga de perdirle al usuario que digite un número mediante una ventana emergente (JOptionPane)
	public int ingresarDatos(String mensaje) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
		return valor;
	}
}
