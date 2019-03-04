package net.instituto.desa;

public class Jugador {
	private int y, x;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void derecha(){
		x=x+1;
		}
	
	public void izquierda(){
		x=x-1;
		}
	
	public void arriba(){
		y=y-1;
		}
	
	public void abajo(){
		y=y+1;
		}
	
	

}
