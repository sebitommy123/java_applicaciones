package dibujos;

import java.awt.Graphics;

public class Cuadrado extends Dibujable{

	private int lado;
	private int y;
	private int x;
	
	public Cuadrado (int lado){
		this.lado=lado;
	}

	@Override
	public void dibujar(Graphics g) {
		
		g.fillRect(x, y, lado, lado);
	}
	
	public void setPossition(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public void click(){
		System.out.println("Has clickeado");
	}
	
	public boolean isInside(int x, int y){
		if (x > this.x && y > this.y && this.x+lado > x && this.y+lado > y){
			return true;
		}else
			return false;
		
	}
	
}
