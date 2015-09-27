package animasiones;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	//aqui pasa todo para crear una nueva ventana para poner las animaciones dentro.
	public Ventana(){
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Panel miPanel = new Panel();
		setContentPane(miPanel);
		setVisible(true);
		miPanel.requestFocus();
	}
}
