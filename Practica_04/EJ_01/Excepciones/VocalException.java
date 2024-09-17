package EJ_01.Excepciones;

public class VocalException extends IllegalArgumentException {

    public VocalException() {}

    public VocalException(String mensaje) {
        super(mensaje);
    }

}