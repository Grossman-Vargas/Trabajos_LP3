import java.util.Scanner;

public class EJ_05 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de horas:");
        int horas = num.nextInt();

        System.out.println("El importe total es de -> S/" + cargo(horas));

    }

    public static double cargo(int horas){
        int cont = 0;
        double cargo = 0;

        for (int i = 0; i < horas; i++) {

            if (cont == 0) {

                cargo += 3;
                cont++;

            } else {

                if (cargo == 12){
                    System.out.println("Se ha rebasado o igualado el importe maximo de S/12," +
                            " horas sobrantes -> " + (horas - i));
                    return cargo;
                }

                cargo += 0.5;
            }
        }
        return cargo;
    }

}
