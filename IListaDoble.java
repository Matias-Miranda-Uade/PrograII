package interfaces;

import modelo.Vehiculo;

public interface IListaDoble {

	boolean esVacia();
	void insertarPrimero(Vehiculo dato);
	void insertarUltimo(Vehiculo dato);
	void mostrarLista();
	void mostrarListaAtras();
	Vehiculo buscarPorPatente(String patente);
}
