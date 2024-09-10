package cliente;

import cuartos.HabitacionNormal;
import reserva.Reserva;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {

    private static int idCounter = 1;

    private int id;
    private String nombre;
    private int preferencia;
    private List<Reserva> historialReservas;

    public Cliente(String nombre) {
        this.id = idCounter++;
        this.nombre = nombre;
        this.preferencia = 0;
        this.historialReservas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPreferencia() {
        return preferencia;
    }

    public void agregarReserva(Reserva reserva) {
        this.historialReservas.add(reserva);
    }

    public void cancelarReserva(HabitacionNormal habitacion) {

        Iterator<Reserva> iterator = historialReservas.iterator();

        while (iterator.hasNext()) {

            Reserva reserva = iterator.next();
            if (reserva.getHabitacion() == habitacion) {

                iterator.remove();
                System.out.println("Reserva cancelada");
                return;

            }

        }
        System.out.println("No se encontró ninguna reserva " + habitacion.getId());
    }

    public int getDescuento() {
        int descuento = 0;
        switch (preferencia) {
            case 1:
                descuento = 20;
                break;
            case 2:
                descuento = 50;
                break;
            case 3:
                descuento = 100;
                break;
        }
        System.out.println("Se recibió un descuento del " + descuento + "%");
        this.preferencia = 0;
        return descuento;
    }

    public List<Reserva> getHistorialReservas() {
        return historialReservas;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + id + ", Nombre: " + nombre + ", Preferencia: " + preferencia;
    }
}
