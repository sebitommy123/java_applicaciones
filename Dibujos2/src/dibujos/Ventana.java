package dibujos;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Ventana extends JFrame{
	
	public Ventana(){
		setContentPane(new Panel());
		//setUndecorated(true);
	}
	
}
