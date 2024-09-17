package ACT_01;

import ACT_01.Excepciones.HistorialVacioException;

import java.io.IOException;

public class Main_ACT {

    public static void main(String[] args) throws HistorialVacioException, IOException {

        CuentaBancaria C1 = new CuentaBancaria("1", "Grossman Vargas", 0);
        CuentaBancaria C2 = new CuentaBancaria("2", "Joaquin Loaiza", 2500);

        Reportes R1 = new Reportes(C1);
        Reportes R2 = new Reportes(C2);

        //"No se pueden generar reportes sin saldo ni transacciones:
        //R1.generarReporte("reporte1.txt");

        R2.generarReporte("reporte2.txt");
        R2.leerReporte("reporte2.txt");

        //Archivo no encontrado:
        //R2.leerReporte("no.txt");

    }
}
