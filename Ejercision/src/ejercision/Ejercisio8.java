package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio8 {

	public static void main(String[] args) {
		String Nombre = JOptionPane.showInputDialog(null, "What's your name?");
		JOptionPane.showMessageDialog(null, "Hola don " + Nombre, "Greeting", JOptionPane.INFORMATION_MESSAGE);
	}

}
