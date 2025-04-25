package modelo;

import interfaces.INodoDoble;

public class NodoDoble implements INodoDoble {

	    private Vehiculo dato;
	    private NodoDoble siguiente;
	    private NodoDoble anterior;

	    public NodoDoble(Vehiculo dato) {
	        this.dato = dato;
	        this.siguiente = null;
	        this.anterior = null;
	    }

	    public Vehiculo getDato() {
	        return dato;
	    }

	    public void setDato(Vehiculo dato) {
	        this.dato = dato;
	    }

	    public NodoDoble getSiguiente() {
	        return siguiente;
	    }

	    public void setSiguiente(NodoDoble siguiente) {
	        this.siguiente = siguiente;
	    }

	    public NodoDoble getAnterior() {
	        return anterior;
	    }

	    public void setAnterior(NodoDoble anterior) {
	        this.anterior = anterior;
	    }
	}

