package modelo;

public class Persona {

	 private int dni;
	    private String nombre;
	    private ListaDoble listaVehiculos;

	    public int getDni() {
	        return dni;
	    }

	    public void setDni(int dni) {
	        this.dni = dni;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public Persona(int dni, String nombre) {
	        this.dni = dni;
	        this.nombre = nombre;
	        this.listaVehiculos = new ListaDoble();
	    }

	    public ListaDoble getListaVehiculos() {
	        return listaVehiculos;
	    }

	    public void setListaVehiculos(ListaDoble listaVehiculos) {
	        this.listaVehiculos = listaVehiculos;
	    }

	    @Override
	    public String toString() {
	        return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	    }

	    public void mostrarPersona() {
	        System.out.println(this);
	        listaVehiculos.mostrarLista();
	    }
	}
