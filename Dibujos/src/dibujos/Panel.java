package dibujos;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	public Panel(){
		
	}
	
	@Override
	public void paint(Graphics g){
		int num = 20;
		for (int i = 0; i < num;i++){
			//g.setColor(new Color((255/num)*i,(255/num)*(num-i),0));
			//g.fillOval(,,(1000/20)*(i*-1+num),(1000/20)*(i*-1+num));
			
			
			int tam = (1000/20)*(i*-1+num);
			
			g.setColor(new Color(0,(255/num)*(num-i),(255/num)*i));
			g.fillOval(0,0,tam/10,tam/10);
		}
		
	}
		
	}
	

