
import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("Think of a number and this will tell you if it is prime");
		int number = Integer.parseInt(num);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number is not prime");
				System.exit(0);
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime");
	}
}
