package EJ_02;

import EJ_02.Excepciones.DivisionCeroException;

public class Calculadora {

    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new DivisionCeroException("Division entre cero detectada :v .");
        }
        return a / b;
    }

}
