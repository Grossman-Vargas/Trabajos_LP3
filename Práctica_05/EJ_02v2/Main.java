package EJ_02v2;

class Main {

    public static void main(String[] args) {

        Par obj_01 = new Par(1, "xd");
        Par obj_02 = new Par(2, 84);
        Par obj_03 = new Par(2, 84);
        Par obj_04 = new Par(1, "xd");

        System.out.println("Comparación entre " + obj_01 + " y " + obj_02);
        System.out.println(Par.esIgual(obj_01, obj_02));

        System.out.println("\nComparación entre " + obj_03 + " y " + obj_04);
        System.out.println(Par.esIgual(obj_03, obj_04));

        System.out.println("\nComparación entre " + obj_01 + " y " + obj_04);
        System.out.println(Par.esIgual(obj_01, obj_04));

        System.out.println("\nComparación entre " + obj_02 + " y " + obj_03);
        System.out.println(Par.esIgual(obj_02, obj_03));

    }

}
