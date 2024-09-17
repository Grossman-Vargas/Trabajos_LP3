package EJ_01;

import EJ_01.Excepciones.BlancoException;
import EJ_01.Excepciones.NumberException;
import EJ_01.Excepciones.SalidaException;
import EJ_01.Excepciones.VocalException;

import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;

public class LeerEntrada {
    private Reader reader;

    public LeerEntrada() {
        this.reader = new InputStreamReader(System.in);
    }

    public void procesar(){

        try{
            if (Character.isLetter((char) reader.read())) {

                throw new VocalException("Se ha ingresado una vocal.");

            } else if (Character.isDigit((char) reader.read())) {

                throw new NumberException("Se ha ingresado un número.");

            } else if (Character.isWhitespace((char) reader.read())) {

                throw new BlancoException("Se ha ingresado un espacio en blanco.");

            } else if ((char) reader.read() == 's' ) {

                throw new SalidaException("Se ha la salida (s).");

            } else {

                System.out.println("No concuerda con ninguna excepcion.");

            }

        } catch (VocalException | NumberException | BlancoException e) {

            System.out.println("Excepción: " + e.getMessage());

        } catch (SalidaException e) {

            System.out.println("Salida: " + e.getMessage());
            System.exit(0);

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Fin del programa.");

        }

    }

}
