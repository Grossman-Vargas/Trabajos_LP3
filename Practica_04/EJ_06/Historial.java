package EJ_06;

import EJ_06.Excepciones.PagoInvalidoException;

import java.time.LocalDate;

public class Historial {

    private LocalDate fecha;
    private double monto;

    public Historial(LocalDate fecha, double monto) {

        if (fecha.isAfter(LocalDate.now())) {

            throw new PagoInvalidoException("Fecha del futuro.");

        }

        if (monto < 0) {

            throw new PagoInvalidoException("Monto negativo.");

        }

        this.fecha = fecha;
        this.monto = monto;

    }

    public LocalDate getFecha() {

        return fecha;

    }

    public double getMonto() {

        return monto;

    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Monto: " + monto;
    }

}
