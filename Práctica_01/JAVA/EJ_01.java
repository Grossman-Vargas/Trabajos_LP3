import java.util.Vector;

public class EJ_01 {

    public static void main(String[] args) {

        Vector<Integer> numeros_2 = new Vector();

        for (int i = 0; i < 6; i++) {
            numeros_2.add(i);
        }


        int[] numeros = new int[6];
        for (int i = 0; i < 6; i++) {
            numeros[i] = i;
        }


        int rpta = suma_arr(numeros);
        int rpta_2 = suma_arr2(numeros_2);
        System.out.println("Suma con arreglo -> " + rpta);
        System.out.println("Suma vector -> " + rpta_2);

    }

    public static int suma_arr(int[] arreglo){
        int cont = 0;

        for (int i : arreglo){
            cont += i;
        }

        return cont;
    }

    public static int suma_arr2(Vector<Integer> vec){
        int cont = 0;
        for (int i : vec){
            cont += i;
        }
        return cont;
    }

}
