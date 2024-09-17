package EJ_06;

import EJ_06.Excepciones.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {

        while (true) {

            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear Contrato");
            System.out.println("2. Crear Historial");
            System.out.println("3. Crear Propiedad");
            System.out.println("4. Crear Transacción");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    crearContrato();
                    break;

                case 2:
                    crearHistorial();
                    break;

                case 3:
                    crearPropiedad();
                    break;

                case 4:
                    crearTransaccion();
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");

            }

        }

    }

    private void crearContrato() {

        try {

            System.out.print("Duración del contrato: ");
            int duracion = scanner.nextInt();

            System.out.print("Monto del alquiler: ");
            double monto = scanner.nextDouble();

            Contrato contrato = new Contrato(duracion, monto);
            System.out.println("Contrato creado: " + contrato);

        } catch (ContratoInvalidoException e) {

            System.out.println("Error al crear contrato: " + e.getMessage());

        }

    }

    private void crearHistorial() {

        try {

            System.out.print("Fecha: ");
            LocalDate fecha = LocalDate.parse(scanner.nextLine());

            System.out.print("Monto: ");
            double monto = scanner.nextDouble();

            Historial historial = new Historial(fecha, monto);
            System.out.println("Historial creado: " + historial);

        } catch (PagoInvalidoException e) {

            System.out.println("Error al crear historial: " + e.getMessage());

        }

    }

    private void crearPropiedad() {

        try {

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Tamaño: ");
            double tamaño = scanner.nextDouble();

            Propiedad propiedad = new Propiedad(direccion, precio, tamaño);
            System.out.println("Propiedad creada: " + propiedad);

        } catch (DatoInvalidoException e) {

            System.out.println("Error al crear propiedad: " + e.getMessage());

        }

    }

    private void crearTransaccion() {

        try {

            System.out.print("ID de la transacción: ");
            int id = scanner.nextInt();

            System.out.print("Dirección de la propiedad: ");
            String direccion = scanner.nextLine();

            System.out.print("Precio de la propiedad: ");
            double precioPropiedad = scanner.nextDouble();

            System.out.print("Tamaño de la propiedad: ");
            double tamañoPropiedad = scanner.nextDouble();

            System.out.print("Precio de la transacción: ");
            double precioTransaccion = scanner.nextDouble();

            Propiedad propiedad = new Propiedad(direccion, precioPropiedad, tamañoPropiedad);
            Transaccion transaccion = new Transaccion(id, propiedad, precioTransaccion);
            System.out.println("Transacción creada: " + transaccion);

        } catch (PrecioInferiorException e) {

            System.out.println("Error al crear transacción: " + e.getMessage());

        } catch (DatoInvalidoException e) {

            System.out.println("Error al crear propiedad: " + e.getMessage());

        }

    }

}
