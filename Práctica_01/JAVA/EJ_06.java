import java.util.Scanner;

public class EJ_06 {

    public static void main(String[] args) {

        int horas = ingreso_entero_pos("Ingrese las horas:");

        int minutos = ingreso_entero_pos("Ingrese los minutos:");
        while (minutos >= 60) {

            horas ++;
            minutos -= 60;

        }

        int segundos = ingreso_entero_pos("Ingrese los segundos:");
        while (segundos >= 60) {

            minutos ++;
            segundos -= 60;

        }

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos +
                " segundos a segundos son " + conver_seg(horas, minutos, segundos));
    }

    public static int conver_seg(int h, int m, int s){

        int segundos = (h * 60 * 60) + m * 60 + s;
        return segundos;

    }

    public static int ingreso_entero_pos(String mensaje){
        System.out.println(mensaje);
        Scanner num = new Scanner(System.in);

        int entero = num.nextInt();
        while(entero < 0){

            System.out.println("Ingrese un numero positivo:");
            entero = num.nextInt();

        }

        return entero;
    }

}