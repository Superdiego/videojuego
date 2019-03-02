package net.instituto.desa;

public class Jugador {
	int y, x;

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
		this.setX(this.getX() + 1);
		}
	
	public void izquierda(){
		this.setX(this.getX() - 1);
		}
	
	public void arriba(){
		this.setY(this.getY() - 1);
		}
	
	public void abajo(){
		this.setY(this.getY() + 1);
		}
	
	

}
