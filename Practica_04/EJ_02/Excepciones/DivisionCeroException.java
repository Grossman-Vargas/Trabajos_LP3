package EJ_02.Excepciones;

public class DivisionCeroException extends ArithmeticException {

    public DivisionCeroException() {}

    public DivisionCeroException(String mensaje) {
        super(mensaje);
    }

}