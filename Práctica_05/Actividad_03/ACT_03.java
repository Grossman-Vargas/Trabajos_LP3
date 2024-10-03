package Actividad_03;

public class ACT_03 {

    public static <T> boolean EsigualA(T e1, T e2) {

        if(e1 == null | e2 == null){
            return false;
        }

        return e1.equals(e2);
    }
}

class Main {
    public static void main(String[] args) {
        Object x = new Object();
        Object y = new Object();


        Integer z = 5;
        Integer f = 5;

        String hola = "Hola";
        String na = "na";

        boolean a = ACT_03.EsigualA(x, x);
        System.out.println(a);

    }
}