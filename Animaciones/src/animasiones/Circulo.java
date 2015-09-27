package animasiones;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {

	private double x;
	private double y;
	private double radio;
	private Color color;
	private double speedX;
	private double speedY;


	public Circulo(double x,double y,double radio,Color color){
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}

	public void comprobarLimites(){
		if (speedX > 0){
			if (x + speedX >= Panel.WIDTH - radio){
				speedX *= -1;
			}
		}else if (speedX < 0){
			if (x + speedX <= radio){
				speedX *= -1;
			}
			
		}
		if (speedY > 0){
			if (y + speedY >= Panel.HEIGHT - radio){
				speedY *= -1;
			}
		}else if (speedY < 0){
			if (y + speedY <= radio){
				speedY *= -1;
			}
			
		}

	}


	public void paint(Graphics g){

		comprobarLimites();

		this.x = this.x + speedX;
		this.y = this.y + speedY;


		g.setColor(color);
		g.fillOval((int)(x-radio), (int)(y-radio), (int)(radio*2), (int)(radio*2));


	}


	public void setSpeed(double speedX,double speedY) {
		this.speedX = speedX;
		this.speedY = speedY;
	}

}