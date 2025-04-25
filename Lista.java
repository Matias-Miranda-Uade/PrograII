package modelo;

import interfaces.ILista;

public class Lista implements ILista {

	private Nodo primero;
	
	public Lista() {
		this.primero=null;
	}

	public boolean esVacia() {
		return primero == null;
	}
	
	public void insertarPrimero(Vehiculo dato) {
		Nodo nuevo= new Nodo(dato);
		if(!esVacia()) {
			nuevo.setSiguiente(primero);
			primero=nuevo;
		} else {
			primero=nuevo;
			
		}
	}
	
	public void insertarUltimo(Vehiculo dato) {
		Nodo nuevo= new Nodo(dato);
		if(esVacia()) {
			primero=nuevo;
		}else {
			Nodo actual=primero;
			while(actual.getSiguiente() != null) {
				actual=actual.getSiguiente();
			}
			actual.setSiguiente(nuevo);
		
			}
		}
	
	public Vehiculo obtenerPrimero() {
		if(esVacia()) throw new IllegalStateException("Lista vacia");
		return primero.getDato();
		
	}
	
	public int cantidadElementos() {
		int contador=0;
		Nodo actual=primero;
		
		while(actual != null) {
			contador=contador+1;
			actual= actual.getSiguiente();
		}
		return contador;
	}
	
	public void mostrarLista() {
		Nodo actual=primero;
		while(actual != null) {
			System.out.println(actual.getDato() +"/n");
			actual=actual.getSiguiente();
		}
	}
}

