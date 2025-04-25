package modelo;

public class ListaDoble {

    private NodoDoble primero;
    private NodoDoble ultimo;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return primero == null;
    }

    public void insertarPrimero(Vehiculo dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (esVacia()) {
            primero = ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    public void insertarUltimo(Vehiculo dato) {
        NodoDoble nuevo = new NodoDoble(dato);
        if (esVacia()) {
            primero = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public void mostrarLista() {
        NodoDoble actual = primero;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

    public void mostrarListaAtras() {
        NodoDoble actual = ultimo;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getAnterior();
        }
    }

    public Vehiculo buscarPorPatente(String patente) {
        NodoDoble actual = primero;
        while (actual != null) {
            if (actual.getDato().getPatente().equalsIgnoreCase(patente)) {
                return actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}

