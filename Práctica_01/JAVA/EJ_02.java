import java.util.Scanner;

public class EJ_02 {

    public static void main(String[] args) {
        int []arreglo;
        arreglo = arr_uni();
        for (int i : arreglo){
            System.out.println(i);
        }
    }

    public static int[] arr_uni(){
        Scanner num = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Ingrese el numero posicion 0: ");
        arr[0] = num.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println("Ingrese el numero posicion " + i + ": ");
            arr[i] = num.nextInt();
            while (arr[i] <= arr[i-1]){
                System.out.println("El numero debe ser mayor a la de la anterior posicion (" +
                        arr[i-1] + "): ");
                arr[i] = num.nextInt();
            }
        }
        return arr;
    }

}
