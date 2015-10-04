package dibujos;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	private ArrayList<Dibujable> dibujables = new ArrayList<>();
	
	
	
	public Panel(){
		Circulo c = new Circulo(25);
		
		Cuadrado c2 = new Cuadrado(50);

		dibujables.add(c);
		dibujables.add(c2);
		
		c.setPossition(560, 200);
		c2.setPossition(300, 300);
		
		dibujables.add(new Hexagono());
		
		MouseListener l = new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				if (c2.isInside(x,y)){
					c2.click();
				
				}
					
				if (c.distancia(x,y)){
					c.click();
					
				

				}
			}
		};
		addMouseListener(l);
		
		
	}

	@Override
	public void paint(Graphics g){
		for(Dibujable d : dibujables){
			d.dibujar(g);
		}
	}

}




