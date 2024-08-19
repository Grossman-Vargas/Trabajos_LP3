import java.util.Random;

public class EJ_03 {

    public static void main(String[] args) {
        int[] dado = new int[6];
        Random rand = new Random();

        /*
        dado[0] = 0;
        dado[1] = 0;
        dado[2] = 0;
        dado[3] = 0;
        dado[4] = 0;
        dado[5] = 0;
        */

        for (int i = 0; i < 20000; i++) {
            int rpta = rand.nextInt(6);
            dado[rpta]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Frecuencia " + (i + 1) + " -> " + dado[i]);
        }

    }

}
