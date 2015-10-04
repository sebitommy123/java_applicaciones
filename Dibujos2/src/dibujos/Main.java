package dibujos;

import javax.swing.JFrame;

public class Main {
	private static final int WIDTH_WINDOW = 1000;
	private static final int HEIGHT_WINDOW = 1000;

	public static void main(String[] args) { 
		
		Ventana V = new Ventana();
		V.setVisible(true);
		V.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		V.setSize(WIDTH_WINDOW, HEIGHT_WINDOW);
		
		
		}
	}
