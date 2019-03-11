package jeg;

/*
 * Jocke Olofsson Uppgift 8.2
 */

import javax.swing.JOptionPane;

public class Övning14 {

	public static double pris(double exmoms, double procent) {
		return exmoms + (exmoms * procent / 100);
	}

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Pris exkl Moms?");
		double x = Double.parseDouble(input);
		JOptionPane.showMessageDialog(null, "Pris inkl moms: " + pris(x, 25));

	}

}
// hej hej hej
