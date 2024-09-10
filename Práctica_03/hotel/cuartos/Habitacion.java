package cuartos;

import cliente.Cliente;

public interface Habitacion {

    void registrarHabitacion();
    boolean disponible(String fecha);
    void reservar(Cliente cliente, String fecha);
    void cancelar(String id);
    void asignarHabitacion(Cliente cliente);
    void liberarHabitacion();
    double getPrecio();
    String getId();
    boolean getCancelable();

}
