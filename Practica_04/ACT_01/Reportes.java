package ACT_01;

import ACT_01.Excepciones.HistorialVacioException;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Reportes {

    private CuentaBancaria cuenta;

    public Reportes(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public void generarReporte(String Ruta) throws HistorialVacioException, IOException {

        if (cuenta.saldo == 0) {

            throw new HistorialVacioException("No se pueden generar reportes saldo ni transacciones.");

        }

        try (FileWriter writer = new FileWriter(Ruta)) {

            writer.write("Número de Cuenta: " + cuenta.NCuenta + "\n");
            writer.write("Titular: " + cuenta.titular + "\n");
            writer.write("Saldo: " + cuenta.saldo + "\n");
            System.out.println("Reporte generado exitosamente.");

        } catch (IOException e) {

            System.out.println("Error al escribir el archivo: " + e.getMessage());
            throw e;

        }
    }


    public void leerReporte(String filePath) throws IOException {

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());

            }

        } catch (FileNotFoundException e) {

            System.out.println("Archivo no encontrado: " + e.getMessage());
            throw e;

        }

    }

}
