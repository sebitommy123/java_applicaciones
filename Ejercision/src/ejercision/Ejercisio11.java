package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio11 {

	public static void main(String[] args) {
		double Radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Radio: "));
		double Pi = Math.PI;
		double Circunference = Radio * 2 * Pi;
		JOptionPane.showMessageDialog(null, "" + Circunference, "Greeting", JOptionPane.INFORMATION_MESSAGE);
	}

}
