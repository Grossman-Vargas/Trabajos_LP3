package EJ_06.Excepciones;

public class PagoInvalidoException extends IllegalArgumentException {

    public PagoInvalidoException() {}

    public PagoInvalidoException(String mensaje) {
        super(mensaje);
    }

}