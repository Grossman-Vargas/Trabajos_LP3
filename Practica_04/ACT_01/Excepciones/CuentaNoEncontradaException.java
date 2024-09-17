package ACT_01.Excepciones;

public class CuentaNoEncontradaException extends IllegalArgumentException {

    public CuentaNoEncontradaException() {}

    public CuentaNoEncontradaException(String mensaje) {
        super(mensaje);
    }

}