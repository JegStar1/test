package jeg;

//* Jocke Olofsson �vning 5.3 *//
import javax.swing.JOptionPane;

public class �vning12 {

	public static void main(String[] args) {
		int dagl�n = 1;
		int dagar = 0;
		int totalL�n = 0;
		while (totalL�n < 1000000000) {
			dagar += 1;
			dagl�n *= 2;
			totalL�n += dagl�n;
		}
		JOptionPane.showMessageDialog(null, "Antal Dagar " + dagar);
	}

}
// hej hej hej
