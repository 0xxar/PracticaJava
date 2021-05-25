package interfas;

public class Retiros extends Operaciones {
    @Override
    public void transacciones() {
        System.out.println("Por favor Sr@ "+getNameUser()+" ingrese el monto a retirar B/.");
        setRetiro(sc.nextDouble());
        getSaldo();
        setSaldo(getSaldo() - getRetiro());

        //if(getRetiro() > getSaldo()){ }
        if(getRetiro()<=getSaldo()){
            System.out.println("Sr@ "+getNameUser()+" usted a realizado un retiro de su cuenta de B/."+getRetiro());
            System.out.println("");
            System.out.println("Usted a realizado un retiro de B/."+getRetiro()+" dejando su cuenta con un balance de B/."+getSaldo());
            RealizarOtraAccion();

        }else{
            System.out.println("Sr@ "+getNameUser()+" el monto ingresado es mayor que su balance actual en la cuenta");
            System.out.println("Por favor consulte su balanace para que puede realizar su deposito deseado");
            RealizarOtraAccion();
        }

    }
}
