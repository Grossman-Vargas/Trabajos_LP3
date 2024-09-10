package reserva;

import cliente.Cliente;
import cuartos.HabitacionNormal;

public class Reserva {

    private static int idCounter = 1;
    private int id;
    private Cliente cliente;
    private HabitacionNormal habitacion;
    private String fecha;

    public Reserva(Cliente cliente, HabitacionNormal habitacion, String fecha) {
        this.id = idCounter;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fecha = fecha;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public HabitacionNormal getHabitacion() {
        return habitacion;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Reserva.Reserva ID: " + id + ", Cliente.Cliente: " + cliente.getNombre() + ", Habitación: " + habitacion.getId() + ", Fecha: " + fecha;
    }
}
