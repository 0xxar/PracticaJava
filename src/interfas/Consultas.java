package interfas;

public class Consultas extends Operaciones{

    @Override
    public void transacciones() {

        System.out.println("Hola bienvenido Sr@ "+getNameUser());
        System.out.println("Su balance actual es de B/."+getSaldo());
        RealizarOtraAccion();

    }
}
