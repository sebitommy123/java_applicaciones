package dibujos;

import java.awt.Graphics;

public class Circulo extends Dibujable{
	
	private int radio;
	private int x;
	private int y;
	
	public Circulo (int radio){
		this.radio=radio;
	}

	@Override
	public void dibujar(Graphics g) {
		g.fillOval(x-radio, y-radio, 2*radio, 2*radio);
	}
	
	public void setPossition(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void click(){
		System.out.println("Has clickeado");
	}


	public boolean distancia(int x,int y) {
		double dist = Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
		if (dist < radio){
			return true;
		}else{
			return false;
		}
		
		
	}
	
}
