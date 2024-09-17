package EJ_04;

public class Main_04 {

    public static void main(String[] args) {

        Registro R1 = new Registro();

        Estudiante E1 = new Estudiante("Grossman Vargas");
        Estudiante E2 = new Estudiante("Miguel Perez");

        R1.agregarEstudiante(E1);
        R1.agregarEstudiante(E2);

        System.out.println("Se encontro a -> " + R1.buscarEstudiante("Grossman Vargas").getNombre());

        //Objeto sin valor.
        //System.out.println("Agregar estudiante nulo:");
        //R1.agregarEstudiante(null);

    }

}
