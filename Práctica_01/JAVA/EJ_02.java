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
        int n1 = num.nextInt();


        int[] arr = new int[10];

        System.out.println("Ingrese un numero: ");
        arr[0] = num.nextInt();

        for (int i = 1; i < 10; i++) {
            arr[i] = num.nextInt();
            while (arr[i] <= arr[i-1]){
                arr[i] = num.nextInt();
            }
        }
        return arr;
    }

}
