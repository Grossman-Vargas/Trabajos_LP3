import java.util.Scanner;

public class EJ_06 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Ingrese las horas: ");
        int horas = num.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = num.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = num.nextInt();

        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos +
                " segundos a segundos son " + conver_seg(horas, minutos, segundos));
    }

    public static int conver_seg(int h, int m, int s){

        int segundos = (h * 60 * 60) + m * 60 + s;
        return segundos;

    }

}
