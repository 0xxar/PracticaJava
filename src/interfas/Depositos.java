package interfas;

public class Depositos extends Operaciones {
    @Override
    public void transacciones() {
        System.out.println("Por favor Sr@ "+getNameUser()+" ingrese el monto a depositar B/.");
        setDeposito(sc.nextDouble());
        setSaldo(getDeposito());
        System.out.println("");
        System.out.println("Usted a realizado un deposito de B/."+getDeposito());
        RealizarOtraAccion();
    }
}
