package Actividad_01;
import java.util.ArrayList;


public class ACT_01 {

    public static <E> void impresionIndice(ArrayList<E> arreglo, E indice_Inf, E indice_Sup){
        if (!arreglo.contains(indice_Inf) || !arreglo.contains(indice_Sup)){

            throw new IndiceNoEncontrado("Uno de los índices no fue encontrado.");

        } else {

            if (arreglo.indexOf(indice_Inf) >= arreglo.indexOf(indice_Sup)){

                throw new IndiceInferiorSuperior("El indice inferior supera al superior xd.");

            } else {

                System.out.println("Elementos en el rango del indice: ");

                for (int x = arreglo.indexOf(indice_Inf); x <= arreglo.indexOf(indice_Sup); x++){

                    System.out.println(arreglo.get(x));

                }

            }

        }

    }

    /* public static < E > void imprimirArreglo( E[] arregloEntrada ) {
        System.out.println("Imprimiendo Arreglo: ");
        for ( E elemento : arregloEntrada ) {

            System.out.printf("%s ", elemento);

        }

    }

     */

    /*public static void imprimirArreglo (ArrayList<? extends Number> arreglo){
        System.out.println("Imprimiendo Arreglo: ");

        for ( Number elemento : arreglo ) {

            System.out.printf("%s ", elemento);

        }

    }

     */

    /* public static void imprimirArreglo (ArrayList<? super Integer> arreglo){

        for ( Object elemento : arreglo ) {

            System.out.printf("%s ", elemento);
        }

    }
     */

    public static void main( String args[] ) {

        ArrayList<Integer> arrayInteger_01 = new ArrayList<Integer>();

        arrayInteger_01.add(1);
        arrayInteger_01.add(2);
        arrayInteger_01.add(3);

        //imprimirArreglo(arrayInteger_01);

        System.out.println("\n");

        ArrayList<Double> arrayInteger_02 = new ArrayList<Double>();

        arrayInteger_02.add(4.5);
        arrayInteger_02.add(2.6);
        arrayInteger_02.add(3.2);
        arrayInteger_02.add(4.5);
        arrayInteger_02.add(2.6);


        ACT_01.impresionIndice(arrayInteger_02, 4.5, 2.6);
        ACT_01.impresionIndice(arrayInteger_02, 3.2, 2.6);

        //imprimirArreglo(arrayInteger_02);

    }

}
