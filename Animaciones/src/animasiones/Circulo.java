package animasiones;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.ArrayList;

public class Circulo {

	private double x;
	private double y;
	private double radio;
	private Color color;
	private double speedX;
	private double speedY;
	private ArrayList<Circulo> hijos = new ArrayList<>();
	private static int numCirculos = 1;


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

	public void apuntarHacia(int mouseX, int mouseY) {
		speedX = (mouseX - x)/Math.sqrt((mouseX - x)*(mouseX - x)+(mouseY - y)*(mouseY - y))*10;
		speedY = (mouseY - y)/Math.sqrt((mouseX - x)*(mouseX - x)+(mouseY - y)*(mouseY - y))*10;
		for(Circulo c : hijos){
			c.apuntarHacia(mouseX, mouseY);
		}
	}
	
	
	public void dividir(Panel p){
		
		double nuevoRadio = radio/Math.sqrt(2);
		radio = nuevoRadio;
		double r = Math.random()*4 -2.0;
		Circulo c = new Circulo(x+speedX*(10+r),y+speedY*(10+r),nuevoRadio,color);System.out.println("Hay: " + ++numCirculos);
		p.add(c);
		for(Circulo cc : hijos){
			cc.dividir(p);
		}
		hijos.add(c);
	}
	

}
