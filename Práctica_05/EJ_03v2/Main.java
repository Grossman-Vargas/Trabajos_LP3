package EJ_03v2;

class Main {

    public static void imprimirPar(Par obj) {

        System.out.println(obj);

    }

    public static void main(String[] args) {

        Persona grossman = new Persona("Grossman");

        Par<String, Integer> obj_01 = new Par("xd", 1);
        Par<Double, Boolean> obj_02 = new Par(2.5, true);
        Par<Persona, Integer> obj_03 = new Par(grossman, 84);

        imprimirPar(obj_01);
        imprimirPar(obj_02);
        imprimirPar(obj_03);

    }

}

