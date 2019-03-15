package jeg;
//* Jocke Olofsson Övning 5.5 *// 
import javax.swing.JOptionPane;

public class Övning11 {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("Antal Rader"); 
		int n = Integer.parseInt(s); 
		for (int i = 1; i <= n; i += 1) {
			for (int j = 1; j <= i; j += 1) {
				System.out.print(i*j + " "); 
			}
				System.out.println("");
			
			
		}
	}

}
