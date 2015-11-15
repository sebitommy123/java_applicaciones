package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio10 {

	public static void main(String[] args) {
		double C = 15.0;
		
		JOptionPane.showMessageDialog(null, C + " deegrees in Fahrenheit is " + (32 + (9 * C / 5)),"title", JOptionPane.INFORMATION_MESSAGE);
	}

}
