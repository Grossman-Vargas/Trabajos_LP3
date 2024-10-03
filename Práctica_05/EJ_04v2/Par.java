package EJ_04v2;

import EJ_03v2.ExceptionObjetoNulo;

public class Par<F, S> {
    protected F el1;
    protected S el2;

    public Par(F el1, S el2) {
        if (el1 != null || el2 != null) {
            this.el1 = el1;
            this.el2 = el2;
        } else {
            throw new EJ_02v2.ExceptionObjetoNulo("Se ingresaron objetos nulos.");
        }
    }

    public F getPrimero() {
        return this.el1;
    }

    public void setPrimero(F el1) {
        if (el1 == null) {
            throw new EJ_02v2.ExceptionObjetoNulo("El elemento no puede ser nulo.");
        } else {
            this.el1 = el1;
        }
    }

    public S getSegundo() {
        return this.el2;
    }

    public void setSegundo(S el2) {
        if (el2 == null) {
            throw new EJ_02v2.ExceptionObjetoNulo("El elemento no puede ser nulo.");
        } else {
            this.el2 = el2;
        }
    }

    public static boolean esIgual(EJ_02v2.Par<?, ?> obj_1, EJ_02v2.Par<?, ?> obj_2) {
        if (obj_1 != null || obj_2 != null) {
            return obj_1.getPrimero().equals(obj_2.getPrimero()) && obj_1.getSegundo().equals(obj_2.getSegundo());
        } else {
            throw new ExceptionObjetoNulo("Se ingresaron objetos nulos.");
        }
    }

    @Override
    public String toString() {
        return "Primero: " + el1 + ", Segundo: " + el2;
    }

}
