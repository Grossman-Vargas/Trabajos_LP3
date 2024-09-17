package EJ_06;

import EJ_06.Excepciones.ContratoInvalidoException;

public class Contrato {

    private int duracion;
    private double monto;

    public Contrato(int duracion, double montoAlquiler) {

        if (duracion < 0) {

            throw new ContratoInvalidoException("Duracion Negativa.");

        }

        if (montoAlquiler <= 0) {

            throw new ContratoInvalidoException("Monto Negativo.");

        }

        this.duracion = duracion;
        this.monto = montoAlquiler;

    }

    public int getDuracion() {

        return duracion;

    }

    public void setDuracion(int duracion) {

        if (duracion < 0) {

            throw new ContratoInvalidoException("Duracion Negativa.");

        }

        this.duracion = duracion;

    }

    public double getMonto() {

        return monto;

    }

    public void setMonto(double monto) {

        if (monto <= 0) {

            throw new ContratoInvalidoException("Monto Negativo.");

        }

        this.monto = monto;

    }

    @Override
    public String toString() {
        return "Duración: " + duracion + " meses, Monto: " + monto;
    }

}
