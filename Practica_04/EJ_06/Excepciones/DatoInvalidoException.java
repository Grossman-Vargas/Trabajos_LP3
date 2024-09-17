package EJ_06.Excepciones;

public class DatoInvalidoException extends IllegalArgumentException {

    public DatoInvalidoException() {}

    public DatoInvalidoException(String mensaje) {
        super(mensaje);
    }

}