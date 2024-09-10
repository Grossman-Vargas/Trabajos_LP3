package cuartos;

import cliente.Cliente;
import reserva.Reserva;

public abstract class HabitacionNormal implements Habitacion {

    protected String id;
    protected double precio;
    protected boolean disponible;
    protected Cliente clienteActual;
    protected String fecha;
    protected boolean cancelable;

    public HabitacionNormal(String id, double precio, boolean cancelable) {

        this.id = id;
        this.precio = precio;
        this.disponible = true;
        this.cancelable = cancelable;

    }

    @Override
    public boolean getCancelable() {
        return cancelable;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean disponible(String fecha) {
        if (this.fecha == null) {
            return true;
        } else if (this.fecha.equals(fecha)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void reservar(Cliente cliente, String fecha) {

        if (disponible(fecha)) {

            this.clienteActual = cliente;
            this.disponible = false;
            this.fecha = fecha;
            System.out.println("Reserva asignada a " + cliente.getNombre() + " para el " + fecha);

        }

    }

    @Override
    public void cancelar(String id) {

            this.clienteActual = null;
            this.disponible = true;
            this.fecha = null;
            System.out.println("Reserva cancelada :(");

    }

    @Override
    public void liberarHabitacion() {

        this.clienteActual = null;
        this.disponible = true;
        this.fecha = null;
        System.out.println("Habitacion disponible nuevamente");

    }

    @Override
    public double getPrecio() {

        double descuento = 1 - clienteActual.getDescuento()/100;
        return precio * descuento;

    }

    @Override
    public void asignarHabitacion(Cliente cliente) {

        this.clienteActual = cliente;

    }
}
