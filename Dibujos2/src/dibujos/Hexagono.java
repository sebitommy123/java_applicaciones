package dibujos;

import java.awt.Graphics;
import java.awt.Polygon;

public class Hexagono extends Dibujable {
	
	
	
	@Override
	public void dibujar(Graphics g) {
		Polygon p = new Polygon();
		
		int lados = 6;
		
		float radio = 50;

				
		float x = radio;
		float y = 0;
		

		for(int i=0;i<lados;i++){
			double angulo = (i*2*Math.PI/lados);
			float cos = (float)Math.cos(angulo);
			float sin = (float)Math.sin(angulo);
			
			float xn = x * cos - y * sin;
			float yn = x * sin + y * cos;
			
			p.addPoint((int)xn+500,(int)yn+500);
		}
		

		
		g.fillPolygon(p);
		
		

		
	}
	

}
