package juego;
import entorno.Herramientas;

import java.awt.Color;

import entorno.Entorno;
public class Arania {
	// Variables de instancia
		private double x;
		private double y;
		private double diametro;
		
		
		public Arania(int x, int y) {
			this.x = x;
			this.y = y;
			this.diametro = 25;	
		}
		
		
		// devuelve la posicion de X
		public double getX() {
			return this.x;
		}

		
		// devuelve la posicion de y
		public double getY() {
			return this.y;
		}
		public void dibujarse(Entorno entorno) {
			entorno.dibujarCirculo(this.x, this.y,this.diametro,Color.WHITE);
		}
	
				

}
