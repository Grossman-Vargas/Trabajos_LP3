package ACT_01;

import ACT_01.Excepciones.CuentaCerradaException;
import ACT_01.Excepciones.CuentaNoEncontradaException;
import ACT_01.Excepciones.SaldoInsuficienteException;
import ACT_01.Excepciones.SaldoNoCeroException;

class CuentaBancaria {

    protected String NCuenta;
    protected String titular;
    protected double saldo;
    protected boolean estado = true;

    public CuentaBancaria(String cuenta, String titular, double saldo) {
        this.NCuenta = cuenta;
        this.titular = titular;
        try{
            this.saldo = saldo;
            if (saldo < 0) {
                throw new IllegalArgumentException("El saldo no puede ser negativo.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public void validar_cuenta() {
        try {
            if (estado == false) {
                throw new CuentaCerradaException("Cuenta inaccesible.");
            }
        } catch (CuentaCerradaException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }


    public void depositar(double monto) {
        validar_cuenta();
        try {
            if (monto <= 0) {
                throw new IllegalArgumentException("El monto ingresado no puede ser negativo.");
            } else {
                saldo += monto;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public void retirar(double monto) {
        validar_cuenta();
        try {
            if (monto <= 0 || monto > saldo) {
                throw new SaldoInsuficienteException("Saldo Insuficiente.");
            } else {
                saldo -= monto;
            }
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public void transferir(CuentaBancaria destino, double monto) {
        validar_cuenta();
        try {
            if (destino == null) {
                throw new CuentaNoEncontradaException("Cuenta no encontrada.");
            }
            destino.depositar(monto);
            retirar(monto);
            System.out.println("Monto despositado correctamente.");

        }catch (CuentaNoEncontradaException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

    public void cerrarCuenta() {
        validar_cuenta();
        try {
            if(saldo != 0) {
                throw new SaldoNoCeroException("El saldo no es cero, inborrable.");
            } else {
                System.out.println("Cuenta cerrada.");
                estado = false;
            }
        } catch (SaldoNoCeroException e) {
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        }
    }

}