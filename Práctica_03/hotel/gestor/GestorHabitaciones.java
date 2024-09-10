package gestor;

import cliente.Cliente;
import cuartos.HabitacionNormal;
import reserva.Reserva;

import java.util.ArrayList;
import java.util.List;

public class GestorHabitaciones {

    private List<HabitacionNormal> habitaciones;
    private double ingresosTotales;

    public GestorHabitaciones() {

        habitaciones = new ArrayList<>();
        ingresosTotales = 0.0;

    }

    public void agregarHabitacion(HabitacionNormal habitacion) {

        habitaciones.add(habitacion);
        habitacion.registrarHabitacion();

    }

    public void asignarHabitacion(Cliente cliente, HabitacionNormal habitacion, String fecha) {
        if (habitacion.disponible(fecha)) {

            habitacion.reservar(cliente, fecha);
            cliente.agregarReserva(new Reserva(cliente,habitacion,fecha));
            ingresosTotales += habitacion.getPrecio();

        } else {

            System.out.println("Habitación no disponible.");

        }

    }

    public void cancelarReserva(Cliente cliente, HabitacionNormal habitacion) {

        if (habitacion.getCancelable()){

            cliente.cancelarReserva(habitacion);
            habitacion.cancelar(habitacion.getId());
            ingresosTotales -= habitacion.getPrecio();

        } else {
            System.out.println("Incancelable :)");
        }


    }

    public double getIngresosTotales() {
        return ingresosTotales;
    }

    public void imprimirInforme() {
        System.out.println("Ingresos Totales: " + ingresosTotales);
    }

}
