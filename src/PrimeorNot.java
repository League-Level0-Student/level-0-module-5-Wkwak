

import javax.swing.JOptionPane;

public class PrimeorNot {
	public static void main (String[] args) {
		String num = JOptionPane.showInputDialog("Think of a number and this will tell you if it is prime");
		int number = Integer.parseInt(num);
		for (int i = 1; i<11; i++) {
			if (i!=number && i!=1) {
				if (number%i == 0) {
					JOptionPane.showMessageDialog(null, "Your number is not prime");
					break;
				}		
			}
			else {
				JOptionPane.showMessageDialog(null, "your number is prime");
				break;
			}
		}
	}
}
