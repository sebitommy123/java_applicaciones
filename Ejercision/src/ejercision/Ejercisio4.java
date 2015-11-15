package ejercision;

import javax.swing.JOptionPane;

public class Ejercisio4 {

	public static void main(String[] args) {
		int A = 0;
		int B = 1;
		int C = 2;
		int StaticB;
		int D = 3;
		
		ME("A es: " + A + "\nB es: " + B + "\nC es: " + C + "\nD es: " + D,"His");
		
		//ME("D = B, D = " + B + ", B = 1","His");
		//ME("B = C, B = " + C + ", C = 2","His");
		//ME("C = A, C = " + A + ", A = 0","His");
		//ME("A = D, A = " + D + ", C = 3","His");
		
		StaticB = B;
		
		B = C; //
		C = A; //
		A = D; //A = 3
		D = StaticB; //
		
		
		ME("A es: " + A + "\nB es: " + B + "\nC es: " + C + "\nD es: " + D,"Despues del cambio");
		
		//ME("Now: A = " + A + "/n" + "B = " + B + "/n" + "C = " + C + "/n" + "D = " + D + "/n","His");
		

	}

	private static void ME(String Message,String Title) {
		JOptionPane.showMessageDialog(null, Message, Title, JOptionPane.INFORMATION_MESSAGE);
		System.out.println(Message);
	}

}
