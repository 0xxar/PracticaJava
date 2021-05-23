package interfas;

import java.util.Scanner;

public abstract class Operaciones {


    Scanner sc = new Scanner(System.in);
    private static double saldo;
    private static String nameUser;
    private double retiro;
    private double deposito;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        Operaciones.saldo = saldo;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        Operaciones.nameUser = nameUser;
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public abstract void transacciones();
}
