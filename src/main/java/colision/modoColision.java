package colision;

import coordenada.Coordenada;

public abstract class modoColision{

	protected double velocidad;
	protected Coordenada posicion;
	protected int distanciaRecorrida;
	
	public abstract void accion();
	
}
