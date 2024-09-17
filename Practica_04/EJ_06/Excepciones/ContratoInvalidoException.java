package EJ_06.Excepciones;

public class ContratoInvalidoException extends IllegalArgumentException {

    public ContratoInvalidoException() {}

    public ContratoInvalidoException(String mensaje) {
        super(mensaje);
    }

}