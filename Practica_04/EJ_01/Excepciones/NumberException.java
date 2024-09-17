package EJ_01.Excepciones;

public class NumberException extends IllegalArgumentException {

    public NumberException() {}

    public NumberException(String mensaje) {
        super(mensaje);
    }

}