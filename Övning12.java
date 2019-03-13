package jeg;

//* Jocke Olofsson övning 5.3 *//
import javax.swing.JOptionPane;

public class Övning12 {

	public static void main(String[] args) {
		int daglön = 1;
		int dagar = 0;
		int totalLön = 0;
		while (totalLön < 1000000000) {
			dagar += 1;
			daglön *= 2;
			totalLön += daglön;
		}
		JOptionPane.showMessageDialog(null, "Antal Dagar " + dagar);
	}

}
// hej hej hej
