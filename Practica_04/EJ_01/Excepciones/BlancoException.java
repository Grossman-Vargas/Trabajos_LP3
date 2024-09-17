package EJ_01.Excepciones;

public class BlancoException extends IllegalArgumentException {

    public BlancoException() {}

    public BlancoException(String mensaje) {
        super(mensaje);
    }

}