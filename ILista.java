package interfaces;

import modelo.Vehiculo;

public interface ILista {

	boolean esVacia();
	void insertarPrimero(Vehiculo dato);
	void insertarUltimo (Vehiculo dato);
	void obtenerPrimero();
	int cantidadElementos();
	void mostrarLista();
}
