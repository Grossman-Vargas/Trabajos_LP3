package EJ_02;

import EJ_02.Excepciones.DivisionCeroException;

public class Main_02 {

    public static void main(String[] args) {

        Calculadora C1 = new Calculadora();

        double suma = C1.sumar(10, 5);
        double resta = C1.restar(10, 5);
        double multiplicacion = C1.multiplicar(10, 5);
        //"Division entre 0 detectada:"
        double division = C1.dividir(10, 0);

        System.out.println("Suma -> " + suma);
        System.out.println("Resta -> " + resta);
        System.out.println("Multiplicación -> " + multiplicacion);

        //System.out.println("División -> " + division);

        }

}
