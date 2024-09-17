package ACT_01.Excepciones;

public class CuentaCerradaException extends IllegalArgumentException {

    public CuentaCerradaException() {}

    public CuentaCerradaException(String mensaje) {
        super(mensaje);
    }

}