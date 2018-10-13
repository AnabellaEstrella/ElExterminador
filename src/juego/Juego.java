package juego;
import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	
	// Variables y métodos propios de cada grupo
	// ...
	Arania arania;
	Personaje personaje;
	void iniciarObjetos() {
		this.arania = new Arania(30,200);
		this.personaje= new Personaje(380,315);
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Prueba del entorno", 800, 600);
		
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		iniciarObjetos();
	}
	
	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...
		//Utilizaba esto para ver los pixeles de la pantalla:
		entorno.cambiarFont("Comic Sans", 12, Color.white);
		for(int x=800;x>0;x-=70) { 
			for(int y=600;y>0;y-=15) {
				entorno.escribirTexto(String.valueOf(x)+"-"+String.valueOf(y), x, y);
			} 
		}
		
		arania.dibujarse(entorno);
		personaje.Dibujar(entorno);
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}