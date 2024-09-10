package gestor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class GestorRecibo {
    private static int idCounter = 1;
    private int id;

    public GestorRecibo() {

        this.id = idCounter++;
    }

    public void crearRecibo(String contenido) {

        try (PrintWriter writer = new PrintWriter(new FileWriter("recibo_" + id + ".txt"))) {

            writer.println(contenido);
            System.out.println("Recibo creado con ID: " + id);

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    public void eliminarRecibo() {

        File archivo = new File("recibo_" + id + ".txt");

        if (archivo.delete()) {
            System.out.println("Recibo eliminado con ID: " + id);
        } else {
            System.out.println("No se pudo eliminar el recibo con ID: " + id);
        }

    }
}
