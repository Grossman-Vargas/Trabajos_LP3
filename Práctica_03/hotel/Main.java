import cliente.Cliente;
import cuartos.HabitacionEconomica;
import cuartos.HabitacionVip;
import cuartos.Suite;
import gestor.GestorHabitaciones;
import gestor.GestorRecibo;
import personal.PersonalComida;
import personal.PersonalLavanderia;
import personal.PersonalLimpieza;
import reserva.Reserva;

public class Main {

    public static void main(String[] args) {

        HabitacionEconomica h1 = new HabitacionEconomica();
        HabitacionVip h2 = new HabitacionVip();
        Suite h3 = new Suite();


        Cliente cliente1 = new Cliente("Grossman");
        Cliente cliente2 = new Cliente("Juan");
        Cliente cliente3 = new Cliente("Miguel");


        GestorHabitaciones gestorHabitaciones = new GestorHabitaciones();
        GestorRecibo gestorRecibo = new GestorRecibo();


        PersonalLimpieza personalLimpieza = new PersonalLimpieza("Juanito");
        PersonalComida personalComida = new PersonalComida("Maria");
        PersonalLavanderia personalLavanderia = new PersonalLavanderia("Carlos");


        System.out.println("Se adhieren las 3 habitaciones al gestor.");
        gestorHabitaciones.agregarHabitacion(h1);
        gestorHabitaciones.agregarHabitacion(h2);
        gestorHabitaciones.agregarHabitacion(h3);


        System.out.println("\nSe asignan las 3 habitaciones a los clientes y también se les pone fecha.");
        gestorHabitaciones.asignarHabitacion(cliente1, h1, "2024-09-15");
        gestorHabitaciones.asignarHabitacion(cliente2, h2, "2024-09-16");
        gestorHabitaciones.asignarHabitacion(cliente3, h3, "2024-09-17");


        System.out.println("\nSe imprimen los clientes.");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);


        System.out.println("\nSe imprimen las reservas del cliente");
        for (Reserva reserva : cliente1.getHistorialReservas()) {
            System.out.println(reserva);
        }


        System.out.println("\nCreación y eliminación de recibo");
        //gestorRecibo.crearRecibo("WAAAAAAAAAAAA");
        gestorRecibo.eliminarRecibo();


        System.out.println("\nPersonal de limpieza");
        personalLimpieza.asignarTarea();
        personalLimpieza.terminarTarea();
        System.out.println(personalLimpieza);


        System.out.println("\nPersonal de comida");
        personalComida.asignarTarea();
        personalComida.terminarTarea();
        System.out.println(personalComida);


        System.out.println("\nPersonal de lavandería");
        personalLavanderia.asignarTarea();
        personalLavanderia.terminarTarea();
        System.out.println(personalLavanderia);


        System.out.println("\nVerificar disponibilidad");
        System.out.println("Habitación Económica disponible: " + h1.disponible("2024-09-15"));
        System.out.println("Habitación VIP disponible: " + h2.disponible("2024-09-16"));
        System.out.println("Habitación Suite disponible: " + h3.disponible("2024-09-20"));

    }

}
