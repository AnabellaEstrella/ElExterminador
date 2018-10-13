package juego;
import java.awt.Color;
import java.awt.Image;
import com.sun.javafx.geom.Rectangle;
import entorno.Herramientas;
import entorno.Entorno;

public class Personaje {
	int ancho;
	int largo;
	double angulo;
	Color color;
	Rectangle rectangulo;
	
	
	public Personaje(int x_inicial, int y_inicial) {
		this.ancho = 30;
		this.largo = 30;
		this.angulo = 0;
		this.color = Color.CYAN;
		this.rectangulo = new Rectangle(x_inicial, y_inicial, this.ancho, this.largo );
	}
	
	
	
	void Dibujar(Entorno entorno) {
		entorno.dibujarRectangulo(this.rectangulo.x + 5, this.rectangulo.y, this.rectangulo.width,this.rectangulo.height, this.angulo, this.color);
		if (entorno.estaPresionada(entorno.TECLA_IZQUIERDA)){
			this.angulo -=0.03;
		}
		if (entorno.estaPresionada(entorno.TECLA_DERECHA)){
			this.angulo +=0.03;
		}
		if (entorno.estaPresionada(entorno.TECLA_ARRIBA)){
			rectangulo.y+= 1;
		}
	}
}
