import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 1;
		JOptionPane.showMessageDialog(null, "0");
		for (int i = 1; i<13; i++) {
			sum2 = sum2 + i;
			sum1 = sum2 + i;
			JOptionPane.showMessageDialog(null, sum1);
		}
		
	}
}
