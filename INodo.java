package interfaces;

import modelo.Nodo;
import modelo.Vehiculo;

public interface INodo {
	Vehiculo getDato();
	void setDato(Vehiculo dato);
	Nodo getSiguiente();
	void setSiguiente(Nodo nodo);
	
}
