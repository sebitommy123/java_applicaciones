package animasiones;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel{
	
	public static final double WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static final double HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	ArrayList<Circulo> circulos = new ArrayList<>();
	
	public Panel(){
		KeyAdapter l = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				
			}
			
		};
		addKeyListener(l);
		
		setFocusable(true);
		setBackground(Color.BLACK);
		
		
		
		Circulo c1 = new Circulo(100,100,100,Color.RED);
		Circulo c2 = new Circulo(0,0,100,Color.BLUE);
		
		c1.setSpeed(10,1);
		c2.setSpeed(WIDTH/100.0, HEIGHT/200.0);
		
		//crear un par de circulos
		circulos.add(c1);
		circulos.add(c2);
		
		comenzarAminacion();
		
		
	}

	private void comenzarAminacion() {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true){
					try {
						Thread.sleep(20);
						repaint();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		});
		t.start();
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g); 
		for(Circulo f : circulos){
			f.paint(g);
		}
		
		
		
	}
	
		
}
