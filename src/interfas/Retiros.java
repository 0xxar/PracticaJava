package interfas;

public class Retiros extends Operaciones {
    @Override
    public void transacciones() {
        System.out.println("Por favor Sr@ "+getNameUser()+" ingrese el monto a retirar B/.");
        setRetiro(sc.nextDouble());
        setSaldo(getSaldo() - getRetiro());
        if(getRetiro() > getSaldo()){
            System.out.println("Sr@ "+getNameUser()+" el monto ingresado en mayor que su balance actual en la cuenta");
            System.out.println("Por favor consulte su balanace para que puede realizar su deposito deseado");
            RealizarOtraAccion();

        }else{
            System.out.println("Sr@ "+getNameUser()+" usted a realizado un retiro de su cuenta de B/."+getSaldo());


        }
        System.out.println("");
        System.out.println("Usted a realizado un deposito de B/."+getDeposito());
        RealizarOtraAccion();
    }
}
