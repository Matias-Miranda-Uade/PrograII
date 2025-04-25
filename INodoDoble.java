package interfaces;

import modelo.NodoDoble;
import modelo.Vehiculo;

public interface INodoDoble {

	Vehiculo getDato();
	void setDato(Vehiculo dato);
	NodoDoble getSiguiente();
	void setSiguiente(NodoDoble siguiente);
	NodoDoble getAnterior();
	void setAnterior(NodoDoble anterior);
}
