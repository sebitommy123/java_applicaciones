package animasiones;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel{
	
	public static final double WIDTH = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
	public static final double HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
	
	final Circulo c2;
	
	ArrayList<Circulo> circulos = new ArrayList<>();
	
	public Panel(){
		c2 = new Circulo(0,0,100,Color.BLUE);
		KeyAdapter l = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
				if (e.getKeyCode() == KeyEvent.VK_SPACE){
					dividir();
				}
				
			}

			
			
		};
		addKeyListener(l);
		
		
		
		MouseMotionAdapter mml = new MouseMotionAdapter() {

			@Override
			public void mouseMoved(MouseEvent e) {
				int mouseX = e.getX();
				int mouseY = e.getY();
				c2.apuntarHacia(mouseX,mouseY);
			}
			
			
			
		};
		addMouseMotionListener(mml);
		
		setFocusable(true);
		setBackground(Color.BLACK);
		
		
		
		Circulo c1 = new Circulo(100,100,100,Color.RED);
		
		
		c1.setSpeed(10,1);
		c2.setSpeed(WIDTH/100.0, HEIGHT/200.0);
		
		//crear un par de circulos
		circulos.add(c1);
		circulos.add(c2);
		
		comenzarAminacion();
		
		
	}

	
	private void dividir() {
		c2.dividir(this);
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

	public void add(Circulo c) {
		circulos.add(c);
	}
	
		
}
