import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
		int n = 0;
		int sum1 = 1;
		JOptionPane.showMessageDialog(null, "0");
		for (int i = 0; i < 13; i++) {
			int total = sum1 + n;
			n = sum1;
			sum1 = total;
			JOptionPane.showMessageDialog(null, total);
		}

	}
}
