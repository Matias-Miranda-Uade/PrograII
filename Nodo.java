package modelo;

public class Nodo {

	private Vehiculo dato;
	private Nodo siguiente;
	
	public Nodo(Vehiculo dato) {
		super();
		this.dato = dato;
		this.siguiente = null;
	}

	public Vehiculo getDato() {
		return dato;
	}

	public void setDato(Vehiculo dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo nodo) {
		this.siguiente = nodo;
	}
	
	
}
