import java.util.Random;
import java.text.DecimalFormat;

public class EJ_04 {

    public static void main(String[] args) {
        Random rand = new Random();

        //Formato 2 decimales
        DecimalFormat formato = new DecimalFormat("#.##");
        int max = 10000;

        double a = rand.nextDouble(max);
        double b = rand.nextDouble(max);
        double c = rand.nextDouble(max);

        System.out.println("El menor numero entre (" + formato.format(a) + ", " + formato.format(b) +
                ", " + formato.format(c) + ") es -> " + formato.format(menor_3(a,b,c)));
    }

    public static double menor_3(double a, double b, double c){
        double min = a;

        if(min > b){
            min = b;
        }

        if(min > c){
            min = c;
        }

        return min;
    }

}
