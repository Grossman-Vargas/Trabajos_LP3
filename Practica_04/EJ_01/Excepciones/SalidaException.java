package EJ_01.Excepciones;

public class SalidaException extends IllegalArgumentException {

    public SalidaException() {}

    public SalidaException(String mensaje) {
        super(mensaje);
    }

}