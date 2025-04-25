package test;
import modelo.Persona;
import modelo.Vehiculo;

public class TestPersonaVehiculo {

    public static void main(String[] args) {

        Persona p = new Persona(47169404, "Matías Miranda");

        p.getListaVehiculos().insertarPrimero(new Vehiculo("AD221HI", "Honda HRV"));
        p.getListaVehiculos().insertarPrimero(new Vehiculo("WFG123", "Audi A1"));
        p.getListaVehiculos().insertarUltimo(new Vehiculo("PFG956", "Ford Ranger"));

        p.mostrarPersona();

        // Prueba de búsqueda
        System.out.println("\nBuscando por patente '11AA222':");
        Vehiculo encontrado = p.getListaVehiculos().buscarPorPatente("11AA222");
        if (encontrado != null) {
            System.out.println("Vehiculo encontrado: " + encontrado);
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
        System.out.println("\nBuscando por patente 'AD221HI':");
        Vehiculo find = p.getListaVehiculos().buscarPorPatente("AD221HI");
        if (find != null) {
            System.out.println("Vehiculo encontrado: " + find);
        } else {
            System.out.println("Vehiculo no encontrado.");
        }
    }
}

