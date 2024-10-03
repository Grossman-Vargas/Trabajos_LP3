package EJ_01v2;

public class Par<F, S> {
    protected F el1;
    protected S el2;

    public Par(F el1, S el2) {
        if (el1 != null || el2 != null) {
            this.el1 = el1;
            this.el2 = el2;
        } else {
            throw new ExceptionObjetoNulo("Se ingresaron objetos nulos.");
        }

    }

    public F getPrimero() {
        return this.el1;
    }

    public void setPrimero(F el1) {
        if (el1 == null) {
            throw new ExceptionObjetoNulo("El elemento no puede ser nulo.");
        } else {
            this.el1 = el1;
        }
    }

    public S getSegundo() {
        return this.el2;
    }

    public void setSegundo(S el2) {
        if (el2 == null) {
            throw new ExceptionObjetoNulo("El elemento no puede ser nulo.");
        } else {
            this.el2 = el2;
        }
    }

    public String toString() {
        return "Primero: " + el1 + ", Segundo: " + el2;
    }
}
