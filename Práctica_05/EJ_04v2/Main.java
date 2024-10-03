package EJ_04v2;

public class Main {

    public static void main(String[] args) {
        Contenedor<String, Integer> contenedor = new Contenedor<>();
        contenedor.agregarPar("xd", 4);
        contenedor.agregarPar("dx", 53);
        contenedor.agregarPar("XD", 212);

        System.out.println("Pares almacenados:");
        contenedor.mostrarPares();

        for (int i = 0; i <= 2; i++) {
            System.out.println("\nPosicion " + i + " : ");
            Par<String, Integer> par = contenedor.obtenerPar(i);
            System.out.println(par);
        }
    }
}
