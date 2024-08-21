import java.util.Scanner;

public class EJ_05 {

    public static void main(String[] args) {

        int horas = ingreso_entero_pos("Ingrese las horas: ");

        System.out.println("El importe total es de -> S/" + cargo(horas));

    }

    public static double cargo(int horas){
        int cont = 0;
        double cargo = 0;
        double importe_t = 0;

        for (int i = 0; i < horas; i++) {
            if (cargo == 12){

                cargo -= 12;
                importe_t++;
                cont--;

            }

            if (cont == 0) {

                cargo += 3;
                cont++;

            } else {

                cargo += 0.5;

            }
        }

        cargo += importe_t*12;
        return cargo;

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







